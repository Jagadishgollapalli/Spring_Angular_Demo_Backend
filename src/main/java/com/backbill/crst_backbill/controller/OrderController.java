package com.backbill.crst_backbill.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.backbill.crst_backbill.entity.Order;
import com.backbill.crst_backbill.service.OrderService;

@RestController()
//@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	public OrderService OrderService;

	@PostMapping("/orders")
	public Order saveOrder(@RequestBody Order order) {
		return OrderService.saveOrder(order);
	}
	
	@GetMapping("/total-orders")
	public List<Order> getOrders(){
		return OrderService.getOrders();
	}
	
	
	@GetMapping("/order/{id}")
	public Order OrderById(@PathVariable(required=true)int id) {
		return OrderService.OrderById(id);
	}
	
	@DeleteMapping("/orders/{id}")
	public void DeleteOrderById(@PathVariable(required=true) int id) {
		 OrderService.DeleteOrderById(id);
	}
}
