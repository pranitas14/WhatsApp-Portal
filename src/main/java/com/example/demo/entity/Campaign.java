package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long campaignId;

    private String name;

    private String status;

    private String startDate;
    private String endDate;
    private String startTime;

    private String ageRange;
    private String location;
    private String interests;

    private String whatsAppMob;

    
    private String template;


	public Long getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getStartDate() {
		return startDate;
	}


	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}


	public String getEndDate() {
		return endDate;
	}


	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getAgeRange() {
		return ageRange;
	}


	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getInterests() {
		return interests;
	}


	public void setInterests(String interests) {
		this.interests = interests;
	}


	public String getWhatsAppMob() {
		return whatsAppMob;
	}


	public void setWhatsAppMob(String whatsAppMob) {
		this.whatsAppMob = whatsAppMob;
	}


	public String getTemplate() {
		return template;
	}


	public void setTemplate(String template) {
		this.template = template;
	}


	public Campaign() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Campaign(Long campaignId, String name, String status, String startDate, String endDate, String startTime,
			String ageRange, String location, String interests, String whatsAppMob, String template) {
		super();
		this.campaignId = campaignId;
		this.name = name;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.ageRange = ageRange;
		this.location = location;
		this.interests = interests;
		this.whatsAppMob = whatsAppMob;
		this.template = template;
	}
    
    
}
