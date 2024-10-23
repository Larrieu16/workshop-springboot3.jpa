package com.larrieu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larrieu.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}