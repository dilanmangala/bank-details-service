package com.javademo.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.javademo.account.request.CustomerProfileRequest;
import com.javademo.account.response.CustomerDetailsResponse;
import com.javademo.account.response.CustomerResponse;
import com.javademo.account.service.CustomerService;

@RestController
public class CustomerController {
	
	private static final Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;
	
	/**
	 * This controller method is used to get customer details related to customer ID
	 * @param appId
	 * @param hash
	 * @param request
	 * @return this returns customer details with address details
	 */
	@GetMapping(value = "/getCustomerProfile")
	public ResponseEntity<CustomerDetailsResponse>  getCustomerProfile(@RequestHeader("appId") String appId,
			@RequestHeader("hash") String hash, @RequestBody CustomerProfileRequest request) {
		ResponseEntity<CustomerDetailsResponse> responseEntity = null;
		CustomerDetailsResponse customerDetailsResponse= new CustomerDetailsResponse();
		try {
			log.info("start fetching Customer profile details in CustomerController for customer ID : {}", request.getCustomerId());
			CustomerResponse customerResponse = customerService.getCustomerProfile(request.getCustomerId());
			customerDetailsResponse.setCustomerResponse(customerResponse);
			customerDetailsResponse.setCustomerId(request.getCustomerId());
			responseEntity = ResponseEntity.status(HttpStatus.OK).body(customerDetailsResponse);
			log.info("end fetching Customer profile details in CustomerController for customer ID : {}", request.getCustomerId());
		} catch (Exception e) {
			log.error("Exception in get customer profile controller {}", e.getMessage());
			customerDetailsResponse.setCustomerId(request.getCustomerId());
			customerDetailsResponse.setErrorCode("001");
			customerDetailsResponse.setErrorDesc("Profile Not Found For Given Customer");
			
			responseEntity = ResponseEntity.status(HttpStatus.NOT_FOUND).body(customerDetailsResponse);
		}
		
		
		return responseEntity;
	}

}
