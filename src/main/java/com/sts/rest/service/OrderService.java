package com.sts.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.rest.entity.Orders;
import com.sts.rest.repository.OrderRepository;

@Service
public class OrderService 
{
    @Autowired
    private OrderRepository serviceRepo;
	public List<Orders> getAllOrders()
	{
		List<Orders> list=new ArrayList<Orders>();
		this.serviceRepo.findAll().forEach(list::add);
		return list;
	}

	public void addOrder(Orders order) {
		this.serviceRepo.save(order);	
	}

	public void updateOrder(int parseInt, Orders order) {
		this.serviceRepo.save(order);	
	}

	public void deleteOrder(int orderId) {
		this.serviceRepo.deleteById(orderId);
		
	}

	

	
}
