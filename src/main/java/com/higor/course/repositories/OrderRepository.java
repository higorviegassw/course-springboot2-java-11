package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.Order;

//@Repository // não precisa pois extende o JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
