package com.javademo.account.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CustomerDetailsResponse {
		private int customerId;
		@JsonInclude(Include.NON_NULL)
		private String errorCode;
		@JsonInclude(Include.NON_NULL)
		private String errorDesc;
		@JsonInclude(Include.NON_NULL)
		private CustomerResponse customerResponse;
		
		@JsonInclude(Include.NON_NULL)
		private String field1;
		@JsonInclude(Include.NON_NULL)
		private String field2;
		@JsonInclude(Include.NON_NULL)
		private String field3;
		@JsonInclude(Include.NON_NULL)
		private String field4;
		@JsonInclude(Include.NON_NULL)
		private String field5;
		
		public String getField1() {
			return field1;
		}
		public void setField1(String field1) {
			this.field1 = field1;
		}
		public String getField2() {
			return field2;
		}
		public void setField2(String field2) {
			this.field2 = field2;
		}
		public String getField3() {
			return field3;
		}
		public void setField3(String field3) {
			this.field3 = field3;
		}
		public String getField4() {
			return field4;
		}
		public void setField4(String field4) {
			this.field4 = field4;
		}
		public String getField5() {
			return field5;
		}
		public void setField5(String field5) {
			this.field5 = field5;
		}
		
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
