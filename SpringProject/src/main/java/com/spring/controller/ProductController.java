package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity.Product;
import com.spring.service.ProductService;


@RestController
public class ProductController {

	@Autowired
	private ProductService proService;
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to Home Page";
		
	}
	@GetMapping("/display") 
	public List<Product> getProduct(){
	return this.proService.getProduct();
	}
	@PostMapping("/insert")
	public Product addProduct(@RequestBody Product product) {
		return this.proService.addProduct(product);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return this.proService.updateProduct(product);
}
	@DeleteMapping("/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		this.proService.deleteProduct(id);
	}
	
	@GetMapping("/search/{id}")
	public Product getProduct(@PathVariable int id) {
		return this.proService.getProduct(id);
	}
	
}
