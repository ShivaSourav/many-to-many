package com.OnlineBuy_example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.OnlineBuy_example.demo.model.ProductData;

public interface ProductRep extends JpaRepository<ProductData, Integer>{
	@Query(value = "Select product_Id from ProductData")
	List<Integer> findallproductid();

}
