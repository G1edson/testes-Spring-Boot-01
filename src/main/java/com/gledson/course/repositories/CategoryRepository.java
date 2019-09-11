package com.gledson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gledson.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
