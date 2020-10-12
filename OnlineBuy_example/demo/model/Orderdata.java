package com.OnlineBuy_example.demo.model;


import java.beans.Transient;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
@AssociationOverrides({
	@AssociationOverride(name="id.productid",joinColumns = @JoinColumn(name="product_Id")),
	@AssociationOverride(name="id.customerid",joinColumns = @JoinColumn(name="customer_Id"))
})
public class Orderdata{


	@EmbeddedId
	private OrderdataId id = new OrderdataId();
	
	@Column(name="orderdate")
	private LocalDate date = LocalDate.now(); 

	
	 @Transient
	    public CustomerData getCustomerData() {
	        return getId().getCustomerdata();
	    }
	 
	    public void setCustomerData(CustomerData customerdata) {
	        getId().setCustomerdata(customerdata);;
	    }
	 
	    @Transient
	    public ProductData getProductData() {
	        return getId().getProductdata();
	    }
	 
	    public void setGroup(ProductData productdata) {
	        getId().setProductdata(productdata);
	    }	    

	public OrderdataId getId() {
		return id;
	}


	public void setId(OrderdataId id) {
		this.id = id;
	}

}
