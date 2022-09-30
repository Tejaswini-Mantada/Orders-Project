package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.rest.entity.Orders;
import com.sts.rest.service.OrderService;


@RestController
@RequestMapping("/rest/order")
public class OrderController
{
	@Autowired
	private OrderService service;
	@GetMapping("/orders")
	public List<Orders> getAllOrders() 
	{
		return service.getAllOrders();
	}
	
	@PostMapping("/addorder")
	public void addOrder(@RequestBody Orders order)
	{
		this.service.addOrder(order);	
	}
	@PutMapping("/orders/{orderId}")
	public void updateOrder(@PathVariable String orderId,@RequestBody Orders ord)
	{
		this.service.updateOrder(Integer.parseInt(orderId),ord);
	}
	@DeleteMapping("/delete/{orderId}")
	public void deleteOrder(@PathVariable int orderId) 
	{
		this.service.deleteOrder(orderId);
	}
	

}
