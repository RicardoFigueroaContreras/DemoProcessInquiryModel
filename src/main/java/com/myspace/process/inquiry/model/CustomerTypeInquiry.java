package com.myspace.process.inquiry.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerTypeInquiry implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label(value = "city")
	private java.lang.String city;
	@org.kie.api.definition.type.Label(value = "channel")
	private java.lang.String channel;
	@org.kie.api.definition.type.Label(value = "campaignId")
	private java.lang.String campaignId;
	@org.kie.api.definition.type.Label(value = "productCount")
	private java.lang.Integer productCount;
	@org.kie.api.definition.type.Label(value = "productYearCount")
	private java.lang.Integer productYearCount;
	@org.kie.api.definition.type.Label(value = "customerType")
	private java.lang.String customerType;

	public CustomerTypeInquiry() {
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

	public java.lang.Integer getProductCount() {
		return this.productCount;
	}

	public void setProductCount(java.lang.Integer productCount) {
		this.productCount = productCount;
	}

	public java.lang.Integer getProductYearCount() {
		return this.productYearCount;
	}

	public void setProductYearCount(java.lang.Integer productYearCount) {
		this.productYearCount = productYearCount;
	}

	public java.lang.String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(java.lang.String customerType) {
		this.customerType = customerType;
	}

	public CustomerTypeInquiry(java.lang.String country, java.lang.String city,
			java.lang.String channel, java.lang.String campaignId,
			java.lang.Integer productCount, java.lang.Integer productYearCount,
			java.lang.String customerType) {
		this.country = country;
		this.city = city;
		this.channel = channel;
		this.campaignId = campaignId;
		this.productCount = productCount;
		this.productYearCount = productYearCount;
		this.customerType = customerType;
	}

}