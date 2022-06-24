package com.javademo.account;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javademo.account.entity.Account;
import com.javademo.account.entity.Address;
import com.javademo.account.entity.Customer;
import com.javademo.account.repository.AccountRepository;
import com.javademo.account.repository.AddressRepository;
import com.javademo.account.repository.CustomerRepository;
import com.javademo.account.service.CustomerService;

@SpringBootApplication
public class AccountApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository repo;
	
	@Autowired
	AddressRepository adddressRepo;
	
	@Autowired
	AccountRepository accountRepo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
		
	}


	@Override
	public void run(String... args) throws Exception {
		
		adddressRepo.save(new Address("street", "building", "address1", "address2", "city", "state"));
		
		
		
		Customer customer = new Customer();
		customer.setActive(true);
		customer.setName("Sai");
		customer.setPanNo("123");
		customer.setPrimaryAccountNo("123456");
		customer.setEmailId("sai@gmail.com");
		customer.setImei("12");
		customer.setLatestLoggedIn(new Date());
		customer.setMobileNo("07712345");
		
		
		customer.setAddress(adddressRepo.findById(1));
		
		List<Account> accountInfoList = new ArrayList<>();
		accountInfoList.add(new Account("12345", "3456", "test", "test", 100.00, customer));
		
		customer.setAccountInfo(accountInfoList);
		repo.save(customer);
		
	}

}
