package com.larrieu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larrieu.course.entities.Order;
import com.larrieu.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
