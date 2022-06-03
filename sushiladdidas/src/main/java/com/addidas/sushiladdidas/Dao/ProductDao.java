package com.addidas.sushiladdidas.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.addidas.sushiladdidas.model.Product;
@Repository
public class ProductDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
public List<Product> getProducts(){
	return jdbcTemplate.query("select * from products", new RowMapper<Product>(){

		@Override
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setId(rs.getInt(1));
			product.setName(rs.getString(2));
			product.setPrice(rs.getString(3));
			return product;
		}
		
	});
	
	
	
}
}
