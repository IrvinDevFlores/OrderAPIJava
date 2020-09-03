package com.hambus.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hambus.app.Order;

@RestController
@RequestMapping("/api")
public class OrdersController {

	private List<Order> orders;


	
	public Order FindOrderById(int id) {
		return orders.stream()
				.filter(order -> order.OrderId == id) .findAny()
				  .orElse(null);
	}
	
	@RequestMapping("/get")
	public String Get() {
	    return "Hola";
	}
	
	
	@RequestMapping("/orders")
	 public List<Order> GetAll() {
	    
		orders = new ArrayList<Order>() ;
		orders.add(Order.builder().ProductOrdered("Piazza")
			.OrderId(1)
			.build());
		
		orders.add(Order.builder().ProductOrdered("Burger")
			.OrderId(2)
			.build());
		
		orders.add(Order.builder().ProductOrdered("Chicken")
			.OrderId(3)
			.build());
	    
	    return orders;
	  }
	
}
