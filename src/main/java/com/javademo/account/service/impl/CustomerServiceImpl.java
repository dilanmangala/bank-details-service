package com.javademo.account.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javademo.account.entity.Account;
import com.javademo.account.entity.Address;
import com.javademo.account.entity.Customer;
import com.javademo.account.repository.AddressRepository;
import com.javademo.account.repository.CustomerRepository;
import com.javademo.account.response.AccountResponse;
import com.javademo.account.response.CustomerResponse;
import com.javademo.account.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	AddressRepository addressRepository;
	
	/**
	 * This service method is used to fetch customer details related to customer ID
	 * and set values to customer response object
	 */
	@Override
	public CustomerResponse getCustomerProfile(int customerId) {
		log.info("start fetching customer profile details for customer ID : {}", customerId);
		Customer customerObj = customerRepository.findByCustomerId(customerId);
		CustomerResponse customerResponse = new CustomerResponse();
		BeanUtils.copyProperties(customerObj, customerResponse);
		log.info("end fetching customer profile details for customer ID : {}", customerId);
		return customerResponse;
	}
	
	/**
	 * This service method is used to fetch customer details related to customer ID
	 * and set values to account response object
	 */
	@Override
	public AccountResponse getAccountDetails(int customerId) {
		log.info("start fetching account profile details for customer ID : {}", customerId);
		Customer customerObj = customerRepository.findByCustomerId(customerId);
		AccountResponse accountResponse = new AccountResponse();
		BeanUtils.copyProperties(customerObj, accountResponse);
		log.info("end fetching account profile details for customer ID : {}", customerId);
		return accountResponse;
	}

}
