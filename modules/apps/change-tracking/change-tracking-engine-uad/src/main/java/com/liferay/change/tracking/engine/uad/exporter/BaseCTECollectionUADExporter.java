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

package com.liferay.change.tracking.engine.uad.exporter;

import com.liferay.change.tracking.engine.model.CTECollection;
import com.liferay.change.tracking.engine.service.CTECollectionLocalService;
import com.liferay.change.tracking.engine.uad.constants.ChangeTrackingEngineUADConstants;

import com.liferay.petra.string.StringBundler;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;

import com.liferay.user.associated.data.exporter.DynamicQueryUADExporter;

import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the cte collection UAD exporter.
 *
 * <p>
 * This implementation exists only as a container for the default methods
 * generated by ServiceBuilder. All custom service methods should be put in
 * {@link CTECollectionUADExporter}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BaseCTECollectionUADExporter
	extends DynamicQueryUADExporter<CTECollection> {
	@Override
	public Class<CTECollection> getTypeClass() {
		return CTECollection.class;
	}

	@Override
	protected ActionableDynamicQuery doGetActionableDynamicQuery() {
		return cteCollectionLocalService.getActionableDynamicQuery();
	}

	@Override
	protected String[] doGetUserIdFieldNames() {
		return ChangeTrackingEngineUADConstants.USER_ID_FIELD_NAMES_CTE_COLLECTION;
	}

	@Override
	protected String toXmlString(CTECollection cteCollection) {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.liferay.change.tracking.engine.model.CTECollection");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>cteCollectionId</column-name><column-value><![CDATA[");
		sb.append(cteCollection.getCteCollectionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(cteCollection.getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(cteCollection.getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(cteCollection.getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(cteCollection.getUserName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	@Reference
	protected CTECollectionLocalService cteCollectionLocalService;
}