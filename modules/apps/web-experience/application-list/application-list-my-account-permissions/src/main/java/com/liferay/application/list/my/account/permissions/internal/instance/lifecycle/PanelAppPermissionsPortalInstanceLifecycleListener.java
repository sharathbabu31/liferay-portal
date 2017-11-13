/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.application.list.my.account.permissions.internal.instance.lifecycle;

import com.liferay.application.list.PanelApp;
import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.my.account.permissions.internal.PanelAppMyAccountPermissions;
import com.liferay.portal.instance.lifecycle.BasePortalInstanceLifecycleListener;
import com.liferay.portal.instance.lifecycle.PortalInstanceLifecycleListener;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.service.PortletLocalService;
import com.liferay.portal.kernel.util.PortletCategoryKeys;

import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Drew Brokke
 */
@Component(immediate = true, service = PortalInstanceLifecycleListener.class)
public class PanelAppPermissionsPortalInstanceLifecycleListener
	extends BasePortalInstanceLifecycleListener {

	@Override
	public void portalInstanceRegistered(Company company) throws Exception {
		List<PanelApp> panelApps = _panelAppRegistry.getPanelApps(
			PortletCategoryKeys.USER_MY_ACCOUNT);

		for (PanelApp panelApp : panelApps) {
			Portlet portlet = _portletLocalService.getPortletById(
				company.getCompanyId(), panelApp.getPortletId());

			if (portlet != null) {
				_panelAppMyAccountPermissions.initPermissions(portlet);
			}
			else if (_log.isDebugEnabled()) {
				_log.debug("Unable to get portlet " + panelApp.getPortletId());
			}
		}
	}

	private static final Log _log = LogFactoryUtil.getLog(
		PanelAppPermissionsPortalInstanceLifecycleListener.class);

	@Reference
	private PanelAppMyAccountPermissions _panelAppMyAccountPermissions;

	@Reference
	private PanelAppRegistry _panelAppRegistry;

	@Reference
	private PortletLocalService _portletLocalService;

}