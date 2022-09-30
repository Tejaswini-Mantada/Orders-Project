package com.sts.rest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders
{
	@Id
	private int orderId;
	private String orderDate;
	private int orderQty;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	public Orders(int orderId, String orderDate, int orderQty) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderQty = orderQty;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderQty=" + orderQty + "]";
	}
	
	

}
