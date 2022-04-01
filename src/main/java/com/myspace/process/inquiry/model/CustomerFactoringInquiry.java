package com.myspace.process.inquiry.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerFactoringInquiry implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label("city")
	private java.lang.String city;
	@org.kie.api.definition.type.Label("channel")
	private java.lang.String channel;
	@org.kie.api.definition.type.Label("campaignId")
	private java.lang.String campaignId;

	@org.kie.api.definition.type.Label(value = "customerType")
	private java.lang.String customerType;

	@org.kie.api.definition.type.Label(value = "riskType")
	private java.lang.String riskType;

	@org.kie.api.definition.type.Label(value = "ics")
	private java.lang.Integer ics;

	@org.kie.api.definition.type.Label(value = "maxLoan")
	private java.lang.Integer maxLoan;

	@org.kie.api.definition.type.Label(value = "tea")
	private java.lang.Double tea;

	@org.kie.api.definition.type.Label(value = "tcea")
	private java.lang.Double tcea;

	@org.kie.api.definition.type.Label(value = "chargesPerMonth")
	private java.lang.Double chargesPerMonth;

	@org.kie.api.definition.type.Label(value = "insurancePerMonth")
	private java.lang.Double insurancePerMonth;

	@org.kie.api.definition.type.Label(value = "status")
	private java.lang.String status;

	@org.kie.api.definition.type.Label(value = "statusMessage")
	private java.lang.String statusMessage;

	public CustomerFactoringInquiry() {
	}

	public java.lang.String getCountry() {
		return this.country;
	}

	public void setCountry(java.lang.String country) {
		this.country = country;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getChannel() {
		return this.channel;
	}

	public void setChannel(java.lang.String channel) {
		this.channel = channel;
	}

	public java.lang.String getCampaignId() {
		return this.campaignId;
	}

	public void setCampaignId(java.lang.String campaignId) {
		this.campaignId = campaignId;
	}

	public java.lang.String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
	}

	public java.lang.String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(java.lang.String riskType) {
		this.riskType = riskType;
	}

	public java.lang.Integer getIcs() {
		return this.ics;
	}

	public void setIcs(java.lang.Integer ics) {
		this.ics = ics;
	}

	public java.lang.Integer getMaxLoan() {
		return this.maxLoan;
	}

	public void setMaxLoan(java.lang.Integer maxLoan) {
		this.maxLoan = maxLoan;
	}

	public java.lang.Double getTea() {
		return this.tea;
	}

	public void setTea(java.lang.Double tea) {
		this.tea = tea;
	}

	public java.lang.Double getTcea() {
		return this.tcea;
	}

	public void setTcea(java.lang.Double tcea) {
		this.tcea = tcea;
	}

	public java.lang.Double getChargesPerMonth() {
		return this.chargesPerMonth;
	}

	public void setChargesPerMonth(java.lang.Double chargesPerMonth) {
		this.chargesPerMonth = chargesPerMonth;
	}

	public java.lang.Double getInsurancePerMonth() {
		return this.insurancePerMonth;
	}

	public void setInsurancePerMonth(java.lang.Double insurancePerMonth) {
		this.insurancePerMonth = insurancePerMonth;
	}

	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	public java.lang.String getStatusMessage() {
		return this.statusMessage;
	}

	public void setStatusMessage(java.lang.String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public CustomerFactoringInquiry(java.lang.String country,
			java.lang.String city, java.lang.String channel,
			java.lang.String campaignId, java.lang.String customerType,
			java.lang.String riskType, java.lang.Integer ics,
			java.lang.Integer maxLoan, java.lang.Double tea,
			java.lang.Double tcea, java.lang.Double chargesPerMonth,
			java.lang.Double insurancePerMonth, java.lang.String status,
			java.lang.String statusMessage) {
		this.country = country;
		this.city = city;
		this.channel = channel;
		this.campaignId = campaignId;
		this.customerType = customerType;
		this.riskType = riskType;
		this.ics = ics;
		this.maxLoan = maxLoan;
		this.tea = tea;
		this.tcea = tcea;
		this.chargesPerMonth = chargesPerMonth;
		this.insurancePerMonth = insurancePerMonth;
		this.status = status;
		this.statusMessage = statusMessage;
	}

}