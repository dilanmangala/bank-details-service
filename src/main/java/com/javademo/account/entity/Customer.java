package com.javademo.account.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;


public class Customer implements Serializable{
	public Customer() {}
	public Customer(String mobileNo, String name, String panNo, String primaryAccountNo, boolean isActive,
			String emailId, String imei, Date latestLoggedIn, Address address, List<Account> accountInfo) {
		this.mobileNo = mobileNo;
		this.name = name;
		this.panNo = panNo;
		this.primaryAccountNo = primaryAccountNo;
		this.isActive = isActive;
		this.emailId = emailId;
		this.imei = imei;
		this.latestLoggedIn = latestLoggedIn;
		this.address = address;
		this.accountInfo = accountInfo;
	}
	private int customerId;
	private String mobileNo;
	private String name;
	private String panNo;
	private String primaryAccountNo;
	private boolean isActive;
	private String emailId;
	private String imei;
	private Date latestLoggedIn;
	
	@JsonIgnore
	private Address address;

	@JsonIgnore
	private List<Account> accountInfo = new ArrayList<>();
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
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
	public List<Account> getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(List<Account> accountInfo) {
		this.accountInfo = accountInfo;
	}
	
	
}
