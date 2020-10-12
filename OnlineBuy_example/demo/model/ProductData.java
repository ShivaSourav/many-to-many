package com.OnlineBuy_example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class ProductData {
	
	@Id
	@SequenceGenerator(name = "PROID",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PROID")
	private Integer product_Id;
	private String productname;
	private Integer price;
	

	 @OneToMany(mappedBy = "id.productdata",cascade = CascadeType.ALL)
	    private Set<Orderdata> orderdata = new HashSet<Orderdata>();
	

	public Integer getprice() {
		return price;
	}

	public void setprice(Integer productprice) {
		this.price = productprice;
	}

	public Set<Orderdata> getOrderdata() {
		return orderdata;
	}

	public void setOrderdata(Set<Orderdata> orderdata) {
		this.orderdata = orderdata;
	}

	public Integer getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(Integer productid) {
		this.product_Id = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	
	
	

}
