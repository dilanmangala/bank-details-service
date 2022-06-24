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
import com.javademo.account.response.AccountDetailsResponse;
import com.javademo.account.response.AccountResponse;
import com.javademo.account.response.CustomerResponse;
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
	public ResponseEntity<AccountDetailsResponse> getAccountDetails(@RequestHeader("appId") String appId,
			@RequestHeader("hash") String hash, @RequestBody CustomerProfileRequest request) {
		ResponseEntity<AccountDetailsResponse> responseEntity = null;
		AccountDetailsResponse accDetailsResponse = new AccountDetailsResponse();
		try {
			log.info("start fetching account profile details in Account Controller for customer ID : {}", request.getCustomerId());
			AccountResponse accountResponse =  customerService.getAccountDetails(request.getCustomerId());
			
			//accDetailsResponse.setCustomerId(request.getCustomerId());
			accDetailsResponse.setAccountResponse(accountResponse);
			accDetailsResponse.setField1(request.getField1());
			accDetailsResponse.setField2(request.getField2());
			accDetailsResponse.setField3(request.getField3());
			accDetailsResponse.setField4(request.getField4());
			accDetailsResponse.setField5(request.getField5());
			responseEntity = ResponseEntity.status(HttpStatus.OK).body(accDetailsResponse);
		
			log.info("end fetching account profile details in Account Controller for customer ID : {}", request.getCustomerId());
		} catch (Exception e) {
			log.error("Exception in get acoount details controller {}", e.getMessage());
			accDetailsResponse.setCustomerId(String.valueOf(request.getCustomerId()));
			accDetailsResponse.setErrorCode("001");
			accDetailsResponse.setErrorDesc("Account Not Found For Given Customer");
			
			responseEntity = ResponseEntity.status(HttpStatus.NOT_FOUND).body(accDetailsResponse);
		}
		return responseEntity;
	}
}

