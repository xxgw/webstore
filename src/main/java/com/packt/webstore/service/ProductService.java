package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Product;

public interface ProductService {
	void updateAllStock();
	List <Product> getAllProducts(); 
}
