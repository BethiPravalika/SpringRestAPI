package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.Entity.Product;
import com.spring.dao.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository prorepo;
	
	 public Product addProduct(Product product)
	 {
		return prorepo.save(product);
	 }
	 public Product updateProduct(Product product) {
		 return prorepo.save(product);
	 }
	 public List<Product> getProduct(){
		 return prorepo.findAll();
	 }
	 public  void  deleteProduct(Integer id) {
		  prorepo.deleteById(id);
	 }
	 public Product getProduct(Integer id) {
		 return prorepo.findById(id).orElseThrow(null);
	 }

}
