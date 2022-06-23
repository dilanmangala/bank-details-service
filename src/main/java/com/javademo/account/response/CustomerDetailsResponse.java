package com.javademo.account.response;

public class CustomerDetailsResponse {
		private int customerId;
		private String errorCode;
		private String errorDesc;
		private CustomerResponse customerResponse;
		
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
		public CustomerResponse getCustomerResponse() {
			return customerResponse;
		}
		public void setCustomerResponse(CustomerResponse customerResponse) {
			this.customerResponse = customerResponse;
		}
		
		
}
