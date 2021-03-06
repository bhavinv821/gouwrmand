package com.spring.gouwrmand.dao;

import java.sql.Date;
import java.util.List;

import com.spring.gouwrmand.entity.Invoice;
import com.spring.gouwrmand.entity.Orders;

public interface OrderDao {
	public void addOrder(Orders o);
	public Orders getOrder(int oid);
	public void deleteOrder(int oid);
	public void updateOrder(Orders o);
	public List<Orders> getMyOrders(int cid);
	public List<Orders> getOrders(Date from, Date to);

	public List<Orders> getTodayOrders(Date today);
	public void changeStatustoReady(int oid);
	
	
	public List<Orders> getAllOrder();
}
