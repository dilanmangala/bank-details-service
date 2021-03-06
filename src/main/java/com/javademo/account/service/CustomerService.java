package com.javademo.account.service;

import com.javademo.account.entity.Customer;
import com.javademo.account.response.AccountResponse;
import com.javademo.account.response.CustomerResponse;

public interface CustomerService {
	
	CustomerResponse getCustomerProfile(int customerId) throws Exception;
	AccountResponse getAccountDetails(int customerId) throws Exception;
}
