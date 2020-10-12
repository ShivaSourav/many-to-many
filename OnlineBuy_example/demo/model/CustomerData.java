package com.OnlineBuy_example.demo.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class CustomerData {
	@Id
	@SequenceGenerator(name = "CUSID",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "CUSID")
	private Integer customer_Id;
	private String customername;
	private String email;


	
	 @OneToMany(mappedBy = "id.customerdata",cascade = CascadeType.ALL)
	    private Set<Orderdata> orderdata = new HashSet<Orderdata>();
	
	

	public Set<Orderdata> getOrderdata() {
		return orderdata;
	}

	public void setOrderdata(Set<Orderdata> orderdata) {
		this.orderdata = orderdata;
	}

	public Integer getCustomer_Id() {
		return customer_Id;
	}

	public void setCustomer_Id(Integer customerid) {
		this.customer_Id = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
}
