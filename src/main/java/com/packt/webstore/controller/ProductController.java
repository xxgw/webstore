package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.service.ProductService;

@Controller
@RequestMapping("market")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@RequestMapping("/products/{category}")
	public String getProductByCategory(Model model, @PathVariable("category") String category){
		model.addAttribute("products", productService.getProductsByCategory(category));
		return "products";
	}
	
	
	@RequestMapping("/update/stock")
	public String updateStock(Model model){
		productService.updateAllStock();
		return "redirect:market/products";
	}
}
