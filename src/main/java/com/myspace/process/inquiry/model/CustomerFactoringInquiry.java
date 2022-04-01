package com.myspace.process.inquiry.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CustomerFactoringInquiry implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "country")
	private java.lang.String country;
	@org.kie.api.definition.type.Label(value = "city")
	private java.lang.String city;
	@org.kie.api.definition.type.Label(value = "channel")
	private java.lang.String channel;
	@org.kie.api.definition.type.Label(value = "campaignId")
	private java.lang.String campaignId;

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

	public CustomerFactoringInquiry(java.lang.String country,
			java.lang.String city, java.lang.String channel,
			java.lang.String campaignId) {
		this.country = country;
		this.city = city;
		this.channel = channel;
		this.campaignId = campaignId;
	}

}