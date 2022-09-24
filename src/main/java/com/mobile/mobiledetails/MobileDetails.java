package com.mobile.mobiledetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class MobileDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mobileId;
	private String mobileName;
	private String mobileModel;
	private String mobileColor;
	private String mobileRam;
	private String mobileRom;
	private String mobilePrice;

//	Getters and Setters

	public Integer getMobileId() {
		return mobileId;
	}

	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getMobileColor() {
		return mobileColor;
	}

	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}

	public String getMobileRam() {
		return mobileRam;
	}

	public void setMobileRam(String mobileRam) {
		this.mobileRam = mobileRam;
	}

	public String getMobileRom() {
		return mobileRom;
	}

	public void setMobileRom(String mobileRom) {
		this.mobileRom = mobileRom;
	}

	public String getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(String mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

}
