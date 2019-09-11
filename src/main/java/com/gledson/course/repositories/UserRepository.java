package com.gledson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gledson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
