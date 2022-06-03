package com.addidas.sushiladdidas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.addidas.sushiladdidas.model.Product;
import com.addidas.sushiladdidas.service.ProductService;

@Controller
public class ProductController {
	@Autowired
 ProductService productService;
	@GetMapping("/listproducts")
	public String ListProductsDetails(Model  model) {
		List<Product> product = productService.getProducts();
		model.addAttribute("product",product);
		return "ListProducts";
	}
}
