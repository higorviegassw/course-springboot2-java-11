package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.Product;

//@Repository // não precisa pois extende o JpaRepository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
