package com.jci.domain;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class GRTableEntity extends TableServiceEntity {

	public GRTableEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;// po number
	}

	public GRTableEntity() {
	}

	private String erp;
	private String region;
	private String plant;
	private String receiptID;
	private String receiptDate;
	private String supplierProcessingStatus;
	private Integer supplierProcessingStatusCode;
	private String supplierProcessingStatusmesssage;
	private String supplierType;
	private Integer supplierDeliveryState;
	private String GRJsonString;
	private String userName;
	private String globalId;
	private String comment;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGlobalId() {
		return globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getGRJsonString() {
		return GRJsonString;
	}

	public void setGRJsonString(String gRJsonString) {
		GRJsonString = gRJsonString;
	}

	public String getReceiptID() {
		return receiptID;
	}

	public void setReceiptID(String receiptID) {
		this.receiptID = receiptID;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getSupplierProcessingStatus() {
		return supplierProcessingStatus;
	}

	public void setSupplierProcessingStatus(String supplierProcessingStatus) {
		this.supplierProcessingStatus = supplierProcessingStatus;
	}

	public Integer getSupplierProcessingStatusCode() {
		return supplierProcessingStatusCode;
	}

	public void setSupplierProcessingStatusCode(Integer supplierProcessingStatusCode) {
		this.supplierProcessingStatusCode = supplierProcessingStatusCode;
	}

	public String getSupplierProcessingStatusmesssage() {
		return supplierProcessingStatusmesssage;
	}

	public void setSupplierProcessingStatusmesssage(String supplierProcessingStatusmesssage) {
		this.supplierProcessingStatusmesssage = supplierProcessingStatusmesssage;
	}

	public String getErp() {
		return erp;
	}

	public void setErp(String erp) {
		this.erp = erp;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getSupplierType() {
		return supplierType;
	}

	public void setSupplierType(String supplierType) {
		this.supplierType = supplierType;
	}

	public Integer getSupplierDeliveryState() {
		return supplierDeliveryState;
	}

	public void setSupplierDeliveryState(Integer supplierDeliveryState) {
		this.supplierDeliveryState = supplierDeliveryState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((partitionKey == null) ? 0 : partitionKey.hashCode());
		result = prime * result + ((rowKey == null) ? 0 : rowKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GRTableEntity other = (GRTableEntity) obj;
		if (partitionKey == null) {
			if (other.partitionKey != null)
				return false;
		} else if (!partitionKey.equals(other.partitionKey))
			return false;
		if (rowKey == null) {
			if (other.rowKey != null)
				return false;
		} else if (!rowKey.equals(other.rowKey))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GRTableEntity [erp=" + erp + ", region=" + region + ",plant=" + plant + ",receiptID=" + receiptID
				+ ",receiptDate=" + receiptDate + ",supplierProcessingStatus=" + supplierProcessingStatus
				+ ",supplierProcessingStatusCode=" + supplierProcessingStatusCode + ",supplierProcessingStatusmesssage="
				+ supplierProcessingStatusmesssage + ",supplierType=" + supplierType + ",supplierDeliveryState="
				+ supplierDeliveryState + ",GRJsonString=" + GRJsonString + "]";
	}

}
