package com.backbill.crst_backbill.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backbill.crst_backbill.entity.Order;
import com.backbill.crst_backbill.entity.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	public Order save(Order order); 
	
}
