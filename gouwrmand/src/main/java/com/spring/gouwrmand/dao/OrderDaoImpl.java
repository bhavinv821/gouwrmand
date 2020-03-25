package com.spring.gouwrmand.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.gouwrmand.entity.FoodItem;
import com.spring.gouwrmand.entity.Orders;

@Repository
public class OrderDaoImpl implements OrderDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void addOrder(Orders o) {
		Session session;
		try {
			session = entityManager.unwrap(Session.class);
			session.save(o);
			//session.close();
		} catch (Exception e) {
			System.out.print("failed addcustomer operation");
		}
	}

	@Override
	public Orders getOrder(int oid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(int oid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOrder(Orders o) {
		Session session;
		Transaction tx = null;  
		try {
			session = entityManager.unwrap(Session.class);
//			tx = session.beginTransaction();
			//String query="update Customer c set c.name=\'"+c.getName()+"\',c.address=\'"+c.getAddress()+"\',c.date_of_birth=\'"+c.getDate_of_birth()+"\',c.email=\'"+c.getEmail()+"\',c.phone_no="+c.getPhone_no()+" where c.customer_id="+c.getCustomer_id();

		//System.out.println(query);
		//	Query thequery=session.createQuery(query);
			
			//int result=thequery.executeUpdate();
			
			session.update(o);
//			tx.commit();
			//session.close();
		} catch (Exception e) {
			System.out.print("failed updatecustomer operation");
		}
	}

	@Override
	public List<Orders> getMyOrders(int custid, Date from, Date to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getOrders(Date from, Date to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getAllOrder() {
		Session currentSession=entityManager.unwrap(Session.class);
		String query="from Orders";
		Query <Orders> theQuery=currentSession.createQuery(query,Orders.class);
		List<Orders>l=theQuery.getResultList();
		return l;
	}

}