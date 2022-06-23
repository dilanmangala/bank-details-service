package com.javademo.account.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class AccountDetailsResponse {
		private int customerId;
		@JsonInclude(Include.NON_NULL)
		private String errorCode;
		@JsonInclude(Include.NON_NULL)
		private String errorDesc;
		@JsonInclude(Include.NON_NULL)
		private AccountResponse accountResponse;
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		public String getErrorDesc() {
			return errorDesc;
		}
		public void setErrorDesc(String errorDesc) {
			this.errorDesc = errorDesc;
		}
		public AccountResponse getAccountResponse() {
			return accountResponse;
		}
		public void setAccountResponse(AccountResponse accountResponse) {
			this.accountResponse = accountResponse;
		}
		
		
}
