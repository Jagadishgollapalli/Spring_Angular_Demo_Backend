package com.backbill.crst_backbill.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backbill.crst_backbill.repository.OrderRepository;
import com.backbill.crst_backbill.entity.Order;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	public OrderRepository orderRepository;
	
	@Override
	public Order saveOrder(Order order) {
		// TODO Auto-generated method stub
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public Order OrderById(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}

	@Override
	public void DeleteOrderById(int id) {
		// TODO Auto-generated method stub
		 orderRepository.deleteById(id);
	}

}
