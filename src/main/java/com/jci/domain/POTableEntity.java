package com.jci.domain;

import com.microsoft.azure.storage.table.TableServiceEntity;

public class POTableEntity extends TableServiceEntity {

	public POTableEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;// po number
	}

	public POTableEntity() {
	}

	private String erp;
	private String region;
	private String plant;
	private String orderNumber;
	private String orderCreationDate;
	private String supplierProcessingStatus;
	private Integer supplierProcessingStatusCode;
	private String supplierProcessingStatusmesssage;
	private String supplierType;
	private Integer supplierDeliveryState;
	private String POJsonString;
	private String userName;
	private String globalId;
	private String comment;

	public String getPOJsonString() {
		return POJsonString;
	}

	public void setPOJsonString(String pOJsonString) {
		POJsonString = pOJsonString;
	}

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

	// New changes
	private String orderStatus;
	private String orderPriority;
	private String customerID;
	private String customerDescription;
	private String customerDUNS;
	private String customerDUNS4;
	private String customerTaxNumber;
	private String customerAddressDescriptor;
	private String customerAddress1;
	private String customerAddress2;
	private String customerAddress3;
	private String customerAddress4;
	private String customerAddress5;
	private String customerCity;
	private String customerCounty;
	private String customerState;
	private String customerCountry;
	private String customerZip;
	private String supplierID;
	private String supplierDescription;
	private String supplierDUNS;
	private String supplierDUNS4;
	private String supplierAddressDescriptor;
	private String supplierAddress1;
	private String supplierAddress2;
	private String supplierAddress3;
	private String supplierAddress4;
	private String supplierAddress5;
	private String supplierCity;
	private String supplierCounty;
	private String supplierState;
	private String supplierCountry;
	private String supplierZip;
	private String buyerCode;
	private String buyerContact;
	private String buyerName;
	private String buyerEmail;
	private String supplierEmail;
	private String deliveryTerm;
	private String paymentTerms;
	private String totalOrderAmount;
	private String inCoTerms;
	private String customerOrderNotes;
	private String supplierOrderNotes;
	private String billTo;
	private String billToAddressDescriptor;
	private String billToAddress1;
	private String billToAddress2;
	private String billToAddress3;
	private String billToAddress4;
	private String billToAddress5;
	private String billToCity;
	private String billToCounty;
	private String billToState;
	private String billToCountry;
	private String billToZip;
	private String remitToAddressDescriptor;
	private String remitToAddress1;
	private String remitToAddress2;
	private String remitToAddress3;
	private String remitToAddress4;
	private String remitToAddress5;
	private String remitToCity;
	private String remitToCounty;
	private String remitToState;
	private String remitToCountry;
	private String remitToZip;
	private String buyerContactPhone;
	private String buyerContactFax;
	private String orderType;
	private String flexStringPOHeader4;
	private String flexStringPOHeader5;
	private String flexStringPOHeader6;
	private String flexStringPOHeader7;
	private String flexStringPOHeader8;
	private String flexStringPOHeader9;
	private String flexIntPOHeader1;
	private String flexIntPOHeader2;
	private String flexIntPOHeader3;
	private String flexIntPOHeader4;
	private String flexIntPOHeader5;
	private String flexFloatPOHeader1;
	private String flexFloatPOHeader2;
	private String flexFloatPOHeader3;
	private String flexFloatPOHeader4;
	private String flexFloatPOHeader5;
	private String flexDatePOHeader1;
	private String flexDatePOHeader2;
	private String flexDatePOHeader3;
	private String flexDatePOHeader4;
	private String flexDatePOHeader5;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderPriority() {
		return orderPriority;
	}

	public void setOrderPriority(String orderPriority) {
		this.orderPriority = orderPriority;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	public String getCustomerDUNS() {
		return customerDUNS;
	}

	public void setCustomerDUNS(String customerDUNS) {
		this.customerDUNS = customerDUNS;
	}

	public String getCustomerDUNS4() {
		return customerDUNS4;
	}

	public void setCustomerDUNS4(String customerDUNS4) {
		this.customerDUNS4 = customerDUNS4;
	}

	public String getCustomerTaxNumber() {
		return customerTaxNumber;
	}

	public void setCustomerTaxNumber(String customerTaxNumber) {
		this.customerTaxNumber = customerTaxNumber;
	}

	public String getCustomerAddressDescriptor() {
		return customerAddressDescriptor;
	}

	public void setCustomerAddressDescriptor(String customerAddressDescriptor) {
		this.customerAddressDescriptor = customerAddressDescriptor;
	}

	public String getCustomerAddress1() {
		return customerAddress1;
	}

	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}

	public String getCustomerAddress2() {
		return customerAddress2;
	}

	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}

	public String getCustomerAddress3() {
		return customerAddress3;
	}

	public void setCustomerAddress3(String customerAddress3) {
		this.customerAddress3 = customerAddress3;
	}

	public String getCustomerAddress4() {
		return customerAddress4;
	}

	public void setCustomerAddress4(String customerAddress4) {
		this.customerAddress4 = customerAddress4;
	}

	public String getCustomerAddress5() {
		return customerAddress5;
	}

	public void setCustomerAddress5(String customerAddress5) {
		this.customerAddress5 = customerAddress5;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	public String getCustomerCounty() {
		return customerCounty;
	}

	public void setCustomerCounty(String customerCounty) {
		this.customerCounty = customerCounty;
	}

	public String getCustomerState() {
		return customerState;
	}

	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	public String getCustomerCountry() {
		return customerCountry;
	}

	public void setCustomerCountry(String customerCountry) {
		this.customerCountry = customerCountry;
	}

	public String getCustomerZip() {
		return customerZip;
	}

	public void setCustomerZip(String customerZip) {
		this.customerZip = customerZip;
	}

	public String getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(String supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierDescription() {
		return supplierDescription;
	}

	public void setSupplierDescription(String supplierDescription) {
		this.supplierDescription = supplierDescription;
	}

	public String getSupplierDUNS() {
		return supplierDUNS;
	}

	public void setSupplierDUNS(String supplierDUNS) {
		this.supplierDUNS = supplierDUNS;
	}

	public String getSupplierDUNS4() {
		return supplierDUNS4;
	}

	public void setSupplierDUNS4(String supplierDUNS4) {
		this.supplierDUNS4 = supplierDUNS4;
	}

	public String getSupplierAddressDescriptor() {
		return supplierAddressDescriptor;
	}

	public void setSupplierAddressDescriptor(String supplierAddressDescriptor) {
		this.supplierAddressDescriptor = supplierAddressDescriptor;
	}

	public String getSupplierAddress1() {
		return supplierAddress1;
	}

	public void setSupplierAddress1(String supplierAddress1) {
		this.supplierAddress1 = supplierAddress1;
	}

	public String getSupplierAddress2() {
		return supplierAddress2;
	}

	public void setSupplierAddress2(String supplierAddress2) {
		this.supplierAddress2 = supplierAddress2;
	}

	public String getSupplierAddress3() {
		return supplierAddress3;
	}

	public void setSupplierAddress3(String supplierAddress3) {
		this.supplierAddress3 = supplierAddress3;
	}

	public String getSupplierAddress4() {
		return supplierAddress4;
	}

	public void setSupplierAddress4(String supplierAddress4) {
		this.supplierAddress4 = supplierAddress4;
	}

	public String getSupplierAddress5() {
		return supplierAddress5;
	}

	public void setSupplierAddress5(String supplierAddress5) {
		this.supplierAddress5 = supplierAddress5;
	}

	public String getSupplierCity() {
		return supplierCity;
	}

	public void setSupplierCity(String supplierCity) {
		this.supplierCity = supplierCity;
	}

	public String getSupplierCounty() {
		return supplierCounty;
	}

	public void setSupplierCounty(String supplierCounty) {
		this.supplierCounty = supplierCounty;
	}

	public String getSupplierState() {
		return supplierState;
	}

	public void setSupplierState(String supplierState) {
		this.supplierState = supplierState;
	}

	public String getSupplierCountry() {
		return supplierCountry;
	}

	public void setSupplierCountry(String supplierCountry) {
		this.supplierCountry = supplierCountry;
	}

	public String getSupplierZip() {
		return supplierZip;
	}

	public void setSupplierZip(String supplierZip) {
		this.supplierZip = supplierZip;
	}

	public String getBuyerCode() {
		return buyerCode;
	}

	public void setBuyerCode(String buyerCode) {
		this.buyerCode = buyerCode;
	}

	public String getBuyerContact() {
		return buyerContact;
	}

	public void setBuyerContact(String buyerContact) {
		this.buyerContact = buyerContact;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}

	public String getDeliveryTerm() {
		return deliveryTerm;
	}

	public void setDeliveryTerm(String deliveryTerm) {
		this.deliveryTerm = deliveryTerm;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(String totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}

	public String getInCoTerms() {
		return inCoTerms;
	}

	public void setInCoTerms(String inCoTerms) {
		this.inCoTerms = inCoTerms;
	}

	public String getCustomerOrderNotes() {
		return customerOrderNotes;
	}

	public void setCustomerOrderNotes(String customerOrderNotes) {
		this.customerOrderNotes = customerOrderNotes;
	}

	public String getSupplierOrderNotes() {
		return supplierOrderNotes;
	}

	public void setSupplierOrderNotes(String supplierOrderNotes) {
		this.supplierOrderNotes = supplierOrderNotes;
	}

	public String getBillTo() {
		return billTo;
	}

	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}

	public String getBillToAddressDescriptor() {
		return billToAddressDescriptor;
	}

	public void setBillToAddressDescriptor(String billToAddressDescriptor) {
		this.billToAddressDescriptor = billToAddressDescriptor;
	}

	public String getBillToAddress1() {
		return billToAddress1;
	}

	public void setBillToAddress1(String billToAddress1) {
		this.billToAddress1 = billToAddress1;
	}

	public String getBillToAddress2() {
		return billToAddress2;
	}

	public void setBillToAddress2(String billToAddress2) {
		this.billToAddress2 = billToAddress2;
	}

	public String getBillToAddress3() {
		return billToAddress3;
	}

	public void setBillToAddress3(String billToAddress3) {
		this.billToAddress3 = billToAddress3;
	}

	public String getBillToAddress4() {
		return billToAddress4;
	}

	public void setBillToAddress4(String billToAddress4) {
		this.billToAddress4 = billToAddress4;
	}

	public String getBillToAddress5() {
		return billToAddress5;
	}

	public void setBillToAddress5(String billToAddress5) {
		this.billToAddress5 = billToAddress5;
	}

	public String getBillToCity() {
		return billToCity;
	}

	public void setBillToCity(String billToCity) {
		this.billToCity = billToCity;
	}

	public String getBillToCounty() {
		return billToCounty;
	}

	public void setBillToCounty(String billToCounty) {
		this.billToCounty = billToCounty;
	}

	public String getBillToState() {
		return billToState;
	}

	public void setBillToState(String billToState) {
		this.billToState = billToState;
	}

	public String getBillToCountry() {
		return billToCountry;
	}

	public void setBillToCountry(String billToCountry) {
		this.billToCountry = billToCountry;
	}

	public String getBillToZip() {
		return billToZip;
	}

	public void setBillToZip(String billToZip) {
		this.billToZip = billToZip;
	}

	public String getRemitToAddressDescriptor() {
		return remitToAddressDescriptor;
	}

	public void setRemitToAddressDescriptor(String remitToAddressDescriptor) {
		this.remitToAddressDescriptor = remitToAddressDescriptor;
	}

	public String getRemitToAddress1() {
		return remitToAddress1;
	}

	public void setRemitToAddress1(String remitToAddress1) {
		this.remitToAddress1 = remitToAddress1;
	}

	public String getRemitToAddress2() {
		return remitToAddress2;
	}

	public void setRemitToAddress2(String remitToAddress2) {
		this.remitToAddress2 = remitToAddress2;
	}

	public String getRemitToAddress3() {
		return remitToAddress3;
	}

	public void setRemitToAddress3(String remitToAddress3) {
		this.remitToAddress3 = remitToAddress3;
	}

	public String getRemitToAddress4() {
		return remitToAddress4;
	}

	public void setRemitToAddress4(String remitToAddress4) {
		this.remitToAddress4 = remitToAddress4;
	}

	public String getRemitToAddress5() {
		return remitToAddress5;
	}

	public void setRemitToAddress5(String remitToAddress5) {
		this.remitToAddress5 = remitToAddress5;
	}

	public String getRemitToCity() {
		return remitToCity;
	}

	public void setRemitToCity(String remitToCity) {
		this.remitToCity = remitToCity;
	}

	public String getRemitToCounty() {
		return remitToCounty;
	}

	public void setRemitToCounty(String remitToCounty) {
		this.remitToCounty = remitToCounty;
	}

	public String getRemitToState() {
		return remitToState;
	}

	public void setRemitToState(String remitToState) {
		this.remitToState = remitToState;
	}

	public String getRemitToCountry() {
		return remitToCountry;
	}

	public void setRemitToCountry(String remitToCountry) {
		this.remitToCountry = remitToCountry;
	}

	public String getRemitToZip() {
		return remitToZip;
	}

	public void setRemitToZip(String remitToZip) {
		this.remitToZip = remitToZip;
	}

	public String getBuyerContactPhone() {
		return buyerContactPhone;
	}

	public void setBuyerContactPhone(String buyerContactPhone) {
		this.buyerContactPhone = buyerContactPhone;
	}

	public String getBuyerContactFax() {
		return buyerContactFax;
	}

	public void setBuyerContactFax(String buyerContactFax) {
		this.buyerContactFax = buyerContactFax;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getFlexStringPOHeader4() {
		return flexStringPOHeader4;
	}

	public void setFlexStringPOHeader4(String flexStringPOHeader4) {
		this.flexStringPOHeader4 = flexStringPOHeader4;
	}

	public String getFlexStringPOHeader5() {
		return flexStringPOHeader5;
	}

	public void setFlexStringPOHeader5(String flexStringPOHeader5) {
		this.flexStringPOHeader5 = flexStringPOHeader5;
	}

	public String getFlexStringPOHeader6() {
		return flexStringPOHeader6;
	}

	public void setFlexStringPOHeader6(String flexStringPOHeader6) {
		this.flexStringPOHeader6 = flexStringPOHeader6;
	}

	public String getFlexStringPOHeader7() {
		return flexStringPOHeader7;
	}

	public void setFlexStringPOHeader7(String flexStringPOHeader7) {
		this.flexStringPOHeader7 = flexStringPOHeader7;
	}

	public String getFlexStringPOHeader8() {
		return flexStringPOHeader8;
	}

	public void setFlexStringPOHeader8(String flexStringPOHeader8) {
		this.flexStringPOHeader8 = flexStringPOHeader8;
	}

	public String getFlexStringPOHeader9() {
		return flexStringPOHeader9;
	}

	public void setFlexStringPOHeader9(String flexStringPOHeader9) {
		this.flexStringPOHeader9 = flexStringPOHeader9;
	}

	public String getFlexIntPOHeader1() {
		return flexIntPOHeader1;
	}

	public void setFlexIntPOHeader1(String flexIntPOHeader1) {
		this.flexIntPOHeader1 = flexIntPOHeader1;
	}

	public String getFlexIntPOHeader2() {
		return flexIntPOHeader2;
	}

	public void setFlexIntPOHeader2(String flexIntPOHeader2) {
		this.flexIntPOHeader2 = flexIntPOHeader2;
	}

	public String getFlexIntPOHeader3() {
		return flexIntPOHeader3;
	}

	public void setFlexIntPOHeader3(String flexIntPOHeader3) {
		this.flexIntPOHeader3 = flexIntPOHeader3;
	}

	public String getFlexIntPOHeader4() {
		return flexIntPOHeader4;
	}

	public void setFlexIntPOHeader4(String flexIntPOHeader4) {
		this.flexIntPOHeader4 = flexIntPOHeader4;
	}

	public String getFlexIntPOHeader5() {
		return flexIntPOHeader5;
	}

	public void setFlexIntPOHeader5(String flexIntPOHeader5) {
		this.flexIntPOHeader5 = flexIntPOHeader5;
	}

	public String getFlexFloatPOHeader1() {
		return flexFloatPOHeader1;
	}

	public void setFlexFloatPOHeader1(String flexFloatPOHeader1) {
		this.flexFloatPOHeader1 = flexFloatPOHeader1;
	}

	public String getFlexFloatPOHeader2() {
		return flexFloatPOHeader2;
	}

	public void setFlexFloatPOHeader2(String flexFloatPOHeader2) {
		this.flexFloatPOHeader2 = flexFloatPOHeader2;
	}

	public String getFlexFloatPOHeader3() {
		return flexFloatPOHeader3;
	}

	public void setFlexFloatPOHeader3(String flexFloatPOHeader3) {
		this.flexFloatPOHeader3 = flexFloatPOHeader3;
	}

	public String getFlexFloatPOHeader4() {
		return flexFloatPOHeader4;
	}

	public void setFlexFloatPOHeader4(String flexFloatPOHeader4) {
		this.flexFloatPOHeader4 = flexFloatPOHeader4;
	}

	public String getFlexFloatPOHeader5() {
		return flexFloatPOHeader5;
	}

	public void setFlexFloatPOHeader5(String flexFloatPOHeader5) {
		this.flexFloatPOHeader5 = flexFloatPOHeader5;
	}

	public String getFlexDatePOHeader1() {
		return flexDatePOHeader1;
	}

	public void setFlexDatePOHeader1(String flexDatePOHeader1) {
		this.flexDatePOHeader1 = flexDatePOHeader1;
	}

	public String getFlexDatePOHeader2() {
		return flexDatePOHeader2;
	}

	public void setFlexDatePOHeader2(String flexDatePOHeader2) {
		this.flexDatePOHeader2 = flexDatePOHeader2;
	}

	public String getFlexDatePOHeader3() {
		return flexDatePOHeader3;
	}

	public void setFlexDatePOHeader3(String flexDatePOHeader3) {
		this.flexDatePOHeader3 = flexDatePOHeader3;
	}

	public String getFlexDatePOHeader4() {
		return flexDatePOHeader4;
	}

	public void setFlexDatePOHeader4(String flexDatePOHeader4) {
		this.flexDatePOHeader4 = flexDatePOHeader4;
	}

	public String getFlexDatePOHeader5() {
		return flexDatePOHeader5;
	}

	public void setFlexDatePOHeader5(String flexDatePOHeader5) {
		this.flexDatePOHeader5 = flexDatePOHeader5;
	}

	@Override
	public String toString() {
		return "POTableEntity [erp=" + erp + ", region=" + region + ", plant=" + plant + ", orderNumber=" + orderNumber
				+ ", orderCreationDate=" + orderCreationDate + ", supplierProcessingStatus=" + supplierProcessingStatus
				+ ", supplierProcessingStatusCode=" + supplierProcessingStatusCode
				+ ", supplierProcessingStatusmesssage=" + supplierProcessingStatusmesssage + ", supplierType="
				+ supplierType + ", supplierDeliveryState=" + supplierDeliveryState + ", orderStatus=" + orderStatus
				+ ", orderPriority=" + orderPriority + ", customerID=" + customerID + ", customerDescription="
				+ customerDescription + ", customerDUNS=" + customerDUNS + ", customerDUNS4=" + customerDUNS4
				+ ", customerTaxNumber=" + customerTaxNumber + ", customerAddressDescriptor="
				+ customerAddressDescriptor + ", customerAddress1=" + customerAddress1 + ", customerAddress2="
				+ customerAddress2 + ", customerAddress3=" + customerAddress3 + ", customerAddress4=" + customerAddress4
				+ ", customerAddress5=" + customerAddress5 + ", customerCity=" + customerCity + ", customerCounty="
				+ customerCounty + ", customerState=" + customerState + ", customerCountry=" + customerCountry
				+ ", customerZip=" + customerZip + ", supplierID=" + supplierID + ", supplierDescription="
				+ supplierDescription + ", supplierDUNS=" + supplierDUNS + ", supplierDUNS4=" + supplierDUNS4
				+ ", supplierAddressDescriptor=" + supplierAddressDescriptor + ", supplierAddress1=" + supplierAddress1
				+ ", supplierAddress2=" + supplierAddress2 + ", supplierAddress3=" + supplierAddress3
				+ ", supplierAddress4=" + supplierAddress4 + ", supplierAddress5=" + supplierAddress5
				+ ", supplierCity=" + supplierCity + ", supplierCounty=" + supplierCounty + ", supplierState="
				+ supplierState + ", supplierCountry=" + supplierCountry + ", supplierZip=" + supplierZip
				+ ", buyerCode=" + buyerCode + ", buyerContact=" + buyerContact + ", buyerName=" + buyerName
				+ ", buyerEmail=" + buyerEmail + ", supplierEmail=" + supplierEmail + ", deliveryTerm=" + deliveryTerm
				+ ", paymentTerms=" + paymentTerms + ", totalOrderAmount=" + totalOrderAmount + ", inCoTerms="
				+ inCoTerms + ", customerOrderNotes=" + customerOrderNotes + ", supplierOrderNotes="
				+ supplierOrderNotes + ", billTo=" + billTo + ", billToAddressDescriptor=" + billToAddressDescriptor
				+ ", billToAddress1=" + billToAddress1 + ", billToAddress2=" + billToAddress2 + ", billToAddress3="
				+ billToAddress3 + ", billToAddress4=" + billToAddress4 + ", billToAddress5=" + billToAddress5
				+ ", billToCity=" + billToCity + ", billToCounty=" + billToCounty + ", billToState=" + billToState
				+ ", billToCountry=" + billToCountry + ", billToZip=" + billToZip + ", remitToAddressDescriptor="
				+ remitToAddressDescriptor + ", remitToAddress1=" + remitToAddress1 + ", remitToAddress2="
				+ remitToAddress2 + ", remitToAddress3=" + remitToAddress3 + ", remitToAddress4=" + remitToAddress4
				+ ", remitToAddress5=" + remitToAddress5 + ", remitToCity=" + remitToCity + ", remitToCounty="
				+ remitToCounty + ", remitToState=" + remitToState + ", remitToCountry=" + remitToCountry
				+ ", remitToZip=" + remitToZip + ", buyerContactPhone=" + buyerContactPhone + ", buyerContactFax="
				+ buyerContactFax + ", orderType=" + orderType + ", flexStringPOHeader4=" + flexStringPOHeader4
				+ ", flexStringPOHeader5=" + flexStringPOHeader5 + ", flexStringPOHeader6=" + flexStringPOHeader6
				+ ", flexStringPOHeader7=" + flexStringPOHeader7 + ", flexStringPOHeader8=" + flexStringPOHeader8
				+ ", flexStringPOHeader9=" + flexStringPOHeader9 + ", flexIntPOHeader1=" + flexIntPOHeader1
				+ ", flexIntPOHeader2=" + flexIntPOHeader2 + ", flexIntPOHeader3=" + flexIntPOHeader3
				+ ", flexIntPOHeader4=" + flexIntPOHeader4 + ", flexIntPOHeader5=" + flexIntPOHeader5
				+ ", flexFloatPOHeader1=" + flexFloatPOHeader1 + ", flexFloatPOHeader2=" + flexFloatPOHeader2
				+ ", flexFloatPOHeader3=" + flexFloatPOHeader3 + ", flexFloatPOHeader4=" + flexFloatPOHeader4
				+ ", flexFloatPOHeader5=" + flexFloatPOHeader5 + ", flexDatePOHeader1=" + flexDatePOHeader1
				+ ", flexDatePOHeader2=" + flexDatePOHeader2 + ", flexDatePOHeader3=" + flexDatePOHeader3
				+ ", flexDatePOHeader4=" + flexDatePOHeader4 + ", flexDatePOHeader5=" + flexDatePOHeader5 + "]";
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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

	public String getOrderCreationDate() {
		return orderCreationDate;
	}

	public void setOrderCreationDate(String orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
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
		POTableEntity other = (POTableEntity) obj;
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

}
