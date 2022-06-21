package com.javademo.account.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Account implements Serializable{
	public Account() {}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String accountNumber;
	private String cardNumber;
	private String ifsc;
	private String branchType;
	private double balance;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	@JsonIgnore
	private Customer customer;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public String getBranchType() {
		return branchType;
	}

	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(String accountNumber, String cardNumber, String ifsc, String branchType, double balance,
			Customer customer) {
		super();
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.ifsc = ifsc;
		this.branchType = branchType;
		this.balance = balance;
		this.customer = customer;
	}
	
	
	
	
}
