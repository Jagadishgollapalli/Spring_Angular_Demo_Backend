package com.backbill.crst_backbill.service;
import java.util.List;

import com.backbill.crst_backbill.entity.Order;

public interface OrderService {

	public Order saveOrder(Order order);

	public List<Order> getOrders();

	public Order OrderById(int id);

	public void DeleteOrderById(int id);

}
