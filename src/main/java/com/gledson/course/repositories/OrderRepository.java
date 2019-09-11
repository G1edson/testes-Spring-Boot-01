package com.gledson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gledson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
