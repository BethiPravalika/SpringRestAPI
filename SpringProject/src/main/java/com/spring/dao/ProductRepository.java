package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.Entity.Product;

public interface ProductRepository extends JpaRepository<Product , Integer> {
	


}

