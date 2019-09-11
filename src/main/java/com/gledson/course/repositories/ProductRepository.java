package com.gledson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gledson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
