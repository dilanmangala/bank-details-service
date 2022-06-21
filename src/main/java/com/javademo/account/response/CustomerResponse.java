package com.javademo.account.response;

import java.util.Date;
import java.util.List;

import com.javademo.account.entity.Account;
import com.javademo.account.entity.Address;

public class CustomerResponse {

	private String mobileNo;
	private String name;
	private String panNo;
	private String primaryAccountNo;
	private boolean isActive;
	private String emailId;
	private String imei;
	private Date latestLoggedIn;
	private Address address;
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getPrimaryAccountNo() {
		return primaryAccountNo;
	}
	public void setPrimaryAccountNo(String primaryAccountNo) {
		this.primaryAccountNo = primaryAccountNo;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public Date getLatestLoggedIn() {
		return latestLoggedIn;
	}
	public void setLatestLoggedIn(Date latestLoggedIn) {
		this.latestLoggedIn = latestLoggedIn;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
}
