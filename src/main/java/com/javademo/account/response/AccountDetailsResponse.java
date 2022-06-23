package com.javademo.account.response;

public class AccountDetailsResponse {
		private int customerId;
		private String errorCode;
		private String errorDesc;
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
