package com.larrieu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larrieu.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
