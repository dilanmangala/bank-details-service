package com.javademo.account.entity;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(value = { "id" })
public class Address implements Serializable{
	public Address() {}
	public Address(String street, String building, String address1, String address2, String city, String state, int pin) {
		this.street = street;
		this.building = building;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	private int id;
	private String street;
	private String building;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private int pin;
	
	@JsonIgnore
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
}
