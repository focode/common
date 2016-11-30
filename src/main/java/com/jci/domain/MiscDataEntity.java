/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.domain;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class MiscDataEntity extends TableServiceEntity {

	public MiscDataEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;// po number
	}

	public MiscDataEntity() {
	}

	private Integer IntransitCount;
	private Integer ProcessedCount;
	private Integer ErrorCount;
	private Integer IntransitGRCount;
	private Integer ProcessedGRCount;
	private Integer ErrorGRCount;
	private Integer IntransitItemCount;
	private Integer ProcessedItemCount;
	private Integer ErrorItemCount;
	private Integer IntransitSupplierCount;
	private Integer ProcessedSupplierCount;
	private Integer ErrorSupplierCount;

	@Override
	public String toString() {
		return "MiscDataEntity [IntransitCount=" + IntransitCount + ", ProcessedCount=" + ProcessedCount
				+ ", ErrorCount=" + ErrorCount + ", IntransitGRCount=" + IntransitGRCount + ", ProcessedGRCount="
				+ ProcessedGRCount + ", ErrorGRCount=" + ErrorGRCount + ", IntransitItemCount=" + IntransitItemCount
				+ ", ProcessedItemCount=" + ProcessedItemCount + ", ErrorItemCount=" + ErrorItemCount
				+ ", IntransitSupplierCount=" + IntransitSupplierCount + ", ProcessedSupplierCount="
				+ ProcessedSupplierCount + ", ErrorSupplierCount=" + ErrorSupplierCount + "]";
	}

	public Integer getIntransitCount() {
		return IntransitCount;
	}

	public void setIntransitCount(Integer intransitCount) {
		IntransitCount = intransitCount;
	}

	public Integer getProcessedCount() {
		return ProcessedCount;
	}

	public void setProcessedCount(Integer processedCount) {
		ProcessedCount = processedCount;
	}

	public Integer getErrorCount() {
		return ErrorCount;
	}

	public void setErrorCount(Integer errorCount) {
		ErrorCount = errorCount;
	}

	public Integer getIntransitGRCount() {
		return IntransitGRCount;
	}

	public void setIntransitGRCount(Integer intransitGRCount) {
		IntransitGRCount = intransitGRCount;
	}

	public Integer getProcessedGRCount() {
		return ProcessedGRCount;
	}

	public void setProcessedGRCount(Integer processedGRCount) {
		ProcessedGRCount = processedGRCount;
	}

	public Integer getErrorGRCount() {
		return ErrorGRCount;
	}

	public void setErrorGRCount(Integer errorGRCount) {
		ErrorGRCount = errorGRCount;
	}

	public Integer getIntransitItemCount() {
		return IntransitItemCount;
	}

	public void setIntransitItemCount(Integer intransitItemCount) {
		IntransitItemCount = intransitItemCount;
	}

	public Integer getProcessedItemCount() {
		return ProcessedItemCount;
	}

	public void setProcessedItemCount(Integer processedItemCount) {
		ProcessedItemCount = processedItemCount;
	}

	public Integer getErrorItemCount() {
		return ErrorItemCount;
	}

	public void setErrorItemCount(Integer errorItemCount) {
		ErrorItemCount = errorItemCount;
	}

	public Integer getIntransitSupplierCount() {
		return IntransitSupplierCount;
	}

	public void setIntransitSupplierCount(Integer intransitSupplierCount) {
		IntransitSupplierCount = intransitSupplierCount;
	}

	public Integer getProcessedSupplierCount() {
		return ProcessedSupplierCount;
	}

	public void setProcessedSupplierCount(Integer processedSupplierCount) {
		ProcessedSupplierCount = processedSupplierCount;
	}

	public Integer getErrorSupplierCount() {
		return ErrorSupplierCount;
	}

	public void setErrorSupplierCount(Integer errorSupplierCount) {
		ErrorSupplierCount = errorSupplierCount;
	}
}
