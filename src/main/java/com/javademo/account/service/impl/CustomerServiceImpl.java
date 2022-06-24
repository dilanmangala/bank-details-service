package com.javademo.account.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javademo.account.entity.Account;
import com.javademo.account.entity.Address;
import com.javademo.account.entity.Customer;
import com.javademo.account.response.AccountResponse;
import com.javademo.account.response.CustomerResponse;
import com.javademo.account.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	/**
	 * This service method is used to fetch customer details related to customer ID
	 * and set values to customer response object
	 */
	@Override
	public CustomerResponse getCustomerProfile(int customerId)  throws Exception{
		log.info("start fetching customer profile details for customer ID : {}", customerId);
		CustomerResponse customerResponse = new CustomerResponse();
		if (setCustomerData().getCustomerId() == customerId) {
			BeanUtils.copyProperties(setCustomerData(), customerResponse);
		}else {
			throw new Exception();
		}
		
		log.info("end fetching customer profile details for customer ID : {}", customerId);
		return customerResponse;
	}

	/**
	 * This service method is used to fetch customer details related to customer ID
	 * and set values to account response object
	 * @throws Exception 
	 */
	@Override
	public AccountResponse getAccountDetails(int customerId) throws Exception {
		log.info("start fetching account profile details for customer ID : {}", customerId);
		AccountResponse accountResponse = new AccountResponse();
		if (setCustomerData().getCustomerId() == customerId) {
		BeanUtils.copyProperties(setCustomerData(), accountResponse);
		}else {
			throw new Exception();
		}
		log.info("end fetching account profile details for customer ID : {}", customerId);
		return accountResponse;
	}

	private Customer setCustomerData() {

		Customer customer = new Customer();
		customer.setCustomerId(2);
		customer.setActive(true);
		customer.setName("Sai");
		customer.setPanNo("123");
		customer.setPrimaryAccountNo("123456");
		customer.setEmailId("sai@gmail.com");
		customer.setImei("12");
		customer.setLatestLoggedIn(new Date());
		customer.setMobileNo("0771234566");

		customer.setAddress(new Address("street", "building", "address1", "address2", "city", "state", 1234));

		List<Account> accountInfoList = new ArrayList<>();
		accountInfoList.add(new Account("12345", "3456", "test", "test", 100.00, customer));

		customer.setAccountInfo(accountInfoList);
		
		return customer;
	}

}
