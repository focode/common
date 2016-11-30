/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.domain;

import java.util.Date;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class PoEntity extends TableServiceEntity {

	/**
	 * Instantiates a new po entity.
	 *
	 * @param partitionKey
	 *            the partition key
	 * @param rowKey
	 *            the row key
	 */
	public PoEntity(String partitionKey, String rowKey) { // NO_UCD (unused
															// code)
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;
	}

	/**
	 * Instantiates a new po entity.
	 */
	public PoEntity() {
	}

	/** The order creation date. */
	private Date orderCreationDate;

	/** The status. */
	private int supplierDeliveryState;

	/** The erp name. */
	private String erpName;

	/** The description. */
	private String description;

	/** The user name. */
	private String userName;

	/** The global id. */
	private String globalId;

	/** The comment. */
	private String comment;

	/** The supp type. */
	private String suppType;

	/** The gr num. */
	private String grNum;

	/** The po ACK. */
	private boolean poACK;

	/** The asn. */
	private boolean asn;

	/** The region. */
	private String region;

	/** The plant. */
	private String plant;

	/**
	 * Gets the order creation date.
	 *
	 * @return the order creation date
	 */
	public Date getOrderCreationDate() {
		return orderCreationDate;
	}

	/**
	 * Sets the order creation date.
	 *
	 * @param orderCreationDate
	 *            the new order creation date
	 */
	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}

	public int getSupplierDeliveryState() {
		return supplierDeliveryState;
	}

	public void setSupplierDeliveryState(int supplierDeliveryState) {
		this.supplierDeliveryState = supplierDeliveryState;
	}

	/**
	 * Gets the erp name.
	 *
	 * @return the erp name
	 */
	public String getErpName() {
		return erpName;
	}

	/**
	 * Sets the erp name.
	 *
	 * @param erpName
	 *            the new erp name
	 */
	public void setErpName(String erpName) {
		this.erpName = erpName;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description
	 *            the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName
	 *            the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the global id.
	 *
	 * @return the global id
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * Sets the global id.
	 *
	 * @param globalId
	 *            the new global id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment
	 *            the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * Gets the gr num.
	 *
	 * @return the gr num
	 */
	public String getGrNum() {
		return grNum;
	}

	/**
	 * Sets the gr num.
	 *
	 * @param grNum
	 *            the new gr num
	 */
	public void setGrNum(String grNum) {
		this.grNum = grNum;
	}

	/**
	 * Checks if is po ACK.
	 *
	 * @return true, if is po ACK
	 */
	public boolean isPoACK() {
		return poACK;
	}

	/**
	 * Sets the po ACK.
	 *
	 * @param poACK
	 *            the new po ACK
	 */
	public void setPoACK(boolean poACK) {
		this.poACK = poACK;
	}

	/**
	 * Checks if is asn.
	 *
	 * @return true, if is asn
	 */
	public boolean isAsn() {
		return asn;
	}

	/**
	 * Sets the asn.
	 *
	 * @param asn
	 *            the new asn
	 */
	public void setAsn(boolean asn) {
		this.asn = asn;
	}

	/**
	 * Gets the region.
	 *
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * Sets the region.
	 *
	 * @param region
	 *            the new region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Gets the plant.
	 *
	 * @return the plant
	 */
	public String getPlant() {
		return plant;
	}

	/**
	 * Sets the plant.
	 *
	 * @param plant
	 *            the new plant
	 */
	public void setPlant(String plant) {
		this.plant = plant;
	}

	/**
	 * Gets the supp type.
	 *
	 * @return the supp type
	 */
	public String getSuppType() {
		return suppType;
	}

	/**
	 * Sets the supp type.
	 *
	 * @param suppType
	 *            the new supp type
	 */
	public void setSuppType(String suppType) {
		this.suppType = suppType;
	}

	@Override
	public String toString() {
		return "PoEntity [orderCreationDate=" + orderCreationDate + ", supplierDeliveryState=" + supplierDeliveryState
				+ ", erpName=" + erpName + ", description=" + description + ", userName=" + userName + ", globalId="
				+ globalId + ", comment=" + comment + ", suppType=" + suppType + ", grNum=" + grNum + ", poACK=" + poACK
				+ ", asn=" + asn + ", region=" + region + ", plant=" + plant + "]";
	}

}
