package com.larrieu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larrieu.course.entities.OrderItem;
import com.larrieu.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
	

}
