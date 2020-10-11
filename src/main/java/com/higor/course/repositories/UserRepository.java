package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.User;

//@Repository // não precisa pois extende o JpaRepository
public interface UserRepository extends JpaRepository<User, Long> {

	
}
