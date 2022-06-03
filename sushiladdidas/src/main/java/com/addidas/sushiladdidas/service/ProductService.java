package com.addidas.sushiladdidas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addidas.sushiladdidas.Dao.ProductDao;
import com.addidas.sushiladdidas.model.Product;
@Service
public class ProductService {
	@Autowired
	ProductDao productDao;
public List<Product> getProducts(){
	return productDao.getProducts();
}
}
