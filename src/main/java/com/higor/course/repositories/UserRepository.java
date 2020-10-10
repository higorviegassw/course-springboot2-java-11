package com.higor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.higor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
