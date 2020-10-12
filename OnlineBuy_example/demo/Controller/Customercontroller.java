package com.OnlineBuy_example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBuy_example.demo.Repository.CustomerRepo;
import com.OnlineBuy_example.demo.model.CustomerData;


@RestController
public class Customercontroller {
	
	@Autowired
	private CustomerRepo customerRepository;

	@PostMapping(value="/insertCustomer")
	public String insertData(@RequestBody CustomerData cus) {
		customerRepository.save(cus);
		return "Inserted Successfully";
	}

}
