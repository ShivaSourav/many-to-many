package com.OnlineBuy_example.demo.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineBuy_example.demo.Repository.CustomerRepo;
import com.OnlineBuy_example.demo.Repository.OrderRepo;
import com.OnlineBuy_example.demo.Repository.ProductRep;
import com.OnlineBuy_example.demo.model.Orderdata;


@RestController
public class OrderController {
	

	@Autowired
	private OrderRepo orderRepository;
	
	@Autowired
	private ProductRep product;
	
	@Autowired
	private CustomerRepo customer;

	@PostMapping(value="/save")
	public String insertData(@RequestBody Orderdata orderdata) {
		orderRepository.save(orderdata);
		return "Inserted Successfully";
	}
	
	
	@GetMapping(value="/did_not_buy")
	public List<Integer> getvalues(){
		List<Integer> totalcustomers = customer.findallcustomerid();
		List<Integer> customers_who_buyed = orderRepository.selectcustomerid();
		List<Integer> didnt_buy = new ArrayList<>(totalcustomers);
		didnt_buy.removeAll(customers_who_buyed);
		return didnt_buy;
	}
	
	
	@GetMapping(value="/particularproduct/{id}")
	public List<Integer> particularprod(@PathVariable Integer id){
		return orderRepository.particularprod(id);
	}
	
	
	@GetMapping(value="/notsoldproduct")
	public List<Integer> notsoldproduct(){
		List<Integer> allproducts = product.findallproductid();
		List<Integer> soldproducts = orderRepository.selectproductid();
		List<Integer> notsold = new ArrayList<>(allproducts);
		notsold.removeAll(soldproducts);
		return notsold;
	}
	
}

