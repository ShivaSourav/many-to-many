package com.OnlineBuy_example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OnlineBuy_example.demo.model.Orderdata;


public interface OrderRepo extends JpaRepository<Orderdata, Integer>{

	@Query(value = "Select CustomerData_customer_Id from OrderData",nativeQuery = true)
	List<Integer> selectcustomerid();
	
	
	@Query(value = "Select ProductData_product_Id	 from OrderData",nativeQuery = true)
	List<Integer> selectproductid();
	
	
	@Query(value="Select CustomerData_customer_Id from OrderData where  ProductData_product_Id	=?",nativeQuery = true)
	List<Integer> particularprod(Integer id);
}
