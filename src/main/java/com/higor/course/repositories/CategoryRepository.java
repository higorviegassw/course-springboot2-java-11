package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.Category;

//@Repository // não precisa pois extende o JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
