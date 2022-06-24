package com.javademo.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication{

	
	
	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		
	}


	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * adddressRepo.save(new Address("street", "building", "address1", "address2",
	 * "city", "state", 1234));
	 * 
	 * Customer customer = new Customer(); customer.setActive(true);
	 * customer.setName("Sai"); customer.setPanNo("123");
	 * customer.setPrimaryAccountNo("123456"); customer.setEmailId("sai@gmail.com");
	 * customer.setImei("12"); customer.setLatestLoggedIn(new Date());
	 * customer.setMobileNo("0771234566");
	 * 
	 * customer.setAddress(adddressRepo.findById(1));
	 * 
	 * List<Account> accountInfoList = new ArrayList<>(); accountInfoList.add(new
	 * Account("12345", "3456", "test", "test", 100.00, customer));
	 * 
	 * customer.setAccountInfo(accountInfoList); repo.save(customer);
	 * 
	 * }
	 */

}
