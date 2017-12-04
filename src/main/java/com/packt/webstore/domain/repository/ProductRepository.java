package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Map;

import com.packt.webstore.domain.Product;

public interface ProductRepository {
	List <Product> getAllProducts();
	List <Product> getProductsByCategory(String category);
	List <Product> getProductsByFilter(Map<String, List<String>> filterParams);
	void updateStock(String productId, long noOfUnits);
	Product getProductById(String productID);
	
}
