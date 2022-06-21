package com.javademo.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.account.request.CustomerProfileRequest;
import com.javademo.account.response.AccountResponse;
import com.javademo.account.service.CustomerService;

@RestController
public class AccountController {
	
	private static final Logger log = LoggerFactory.getLogger(AccountController.class);
	
	@Autowired
	CustomerService customerService;
	
	/**
	 * This controller method is used get account details related to customer ID
	 * @param appId
	 * @param hash
	 * @param request
	 * @return this returns customer details with account details list
	 */
	@GetMapping(value = "/getAccountDetails")
	public AccountResponse getAccountDetails(@RequestHeader("appId") String appId,
			@RequestHeader("hash") String hash, @RequestBody CustomerProfileRequest request) {
		log.info("start fetching account profile details in Account Controller for customer ID : {}", request.getCustomerId());
		return customerService.getAccountDetails(request.getCustomerId());
	}
}
