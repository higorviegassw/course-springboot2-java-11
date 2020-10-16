package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.OrderItem;

//@Repository // não precisa pois extende o JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
