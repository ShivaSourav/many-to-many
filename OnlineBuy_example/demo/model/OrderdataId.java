package com.OnlineBuy_example.demo.model;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderdataId implements Serializable{
	

	@ManyToOne(cascade = CascadeType.ALL)
	private CustomerData customerdata;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ProductData productdata;

	public CustomerData getCustomerdata() {
		return customerdata;
	}

	public void setCustomerdata(CustomerData customerdata) {
		this.customerdata = customerdata;
	}

	public ProductData getProductdata() {
		return productdata;
	}

	public void setProductdata(ProductData productdata) {
		this.productdata = productdata;
	}


	

	
}