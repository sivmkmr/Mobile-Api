package com.mobile.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.mobile.mobiledetails.MobileDetails;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse {

	private String message;

	private List<MobileDetails> allMobileDetails;

	private MobileDetails mobileDetails;
	
	private Boolean status;

//	Getters and Setters


	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MobileDetails> getAllMobileDetails() {
		return allMobileDetails;
	}

	public void setAllMobileDetails(List<MobileDetails> allMobileDetails) {
		this.allMobileDetails = allMobileDetails;
	}

	public MobileDetails getMobileDetails() {
		return mobileDetails;
	}

	public void setMobileDetails(MobileDetails mobileDetails) {
		this.mobileDetails = mobileDetails;
	}
}
