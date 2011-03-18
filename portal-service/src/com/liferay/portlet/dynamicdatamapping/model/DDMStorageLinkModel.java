/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.dynamicdatamapping.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the DDMStorageLink service. Represents a row in the &quot;DDMStorageLink&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMStorageLink
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkImpl
 * @see com.liferay.portlet.dynamicdatamapping.model.impl.DDMStorageLinkModelImpl
 * @generated
 */
public interface DDMStorageLinkModel extends BaseModel<DDMStorageLink> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a d d m storage link model instance should use the {@link DDMStorageLink} interface instead.
	 */

	/**
	 * Gets the primary key of this d d m storage link.
	 *
	 * @return the primary key of this d d m storage link
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this d d m storage link
	 *
	 * @param pk the primary key of this d d m storage link
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this d d m storage link.
	 *
	 * @return the uuid of this d d m storage link
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this d d m storage link.
	 *
	 * @param uuid the uuid of this d d m storage link
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the storage link ID of this d d m storage link.
	 *
	 * @return the storage link ID of this d d m storage link
	 */
	public long getStorageLinkId();

	/**
	 * Sets the storage link ID of this d d m storage link.
	 *
	 * @param storageLinkId the storage link ID of this d d m storage link
	 */
	public void setStorageLinkId(long storageLinkId);

	/**
	 * Gets the class name of the model instance this d d m storage link is polymorphically associated with.
	 *
	 * @return the class name of the model instance this d d m storage link is polymorphically associated with
	 */
	public String getClassName();

	/**
	 * Gets the class name ID of this d d m storage link.
	 *
	 * @return the class name ID of this d d m storage link
	 */
	public long getClassNameId();

	/**
	 * Sets the class name ID of this d d m storage link.
	 *
	 * @param classNameId the class name ID of this d d m storage link
	 */
	public void setClassNameId(long classNameId);

	/**
	 * Gets the class p k of this d d m storage link.
	 *
	 * @return the class p k of this d d m storage link
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this d d m storage link.
	 *
	 * @param classPK the class p k of this d d m storage link
	 */
	public void setClassPK(long classPK);

	/**
	 * Gets the structure ID of this d d m storage link.
	 *
	 * @return the structure ID of this d d m storage link
	 */
	public long getStructureId();

	/**
	 * Sets the structure ID of this d d m storage link.
	 *
	 * @param structureId the structure ID of this d d m storage link
	 */
	public void setStructureId(long structureId);

	/**
	 * Gets the type of this d d m storage link.
	 *
	 * @return the type of this d d m storage link
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this d d m storage link.
	 *
	 * @param type the type of this d d m storage link
	 */
	public void setType(String type);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(DDMStorageLink ddmStorageLink);

	public int hashCode();

	public DDMStorageLink toEscapedModel();

	public String toString();

	public String toXmlString();
}