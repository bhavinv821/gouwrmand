package com.spring.gouwrmand.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant_staff")
public class RestaurantStaff {
	@Id
	@Column(name = "staff_id")
	private int staff_id;
	
	@Column(name = "staff_status")
	private int staff_status;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "date_of_birth")
	private Date date_of_birth;

	@Column(name = "password")
	private String password;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_no")
	private long phone_no;

	@Column(name = "role_id")
	private int role_id;

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public int getStaff_status() {
		return staff_status;
	}

	public void setStaff_status(int staff_status) {
		this.staff_status = staff_status;
	}
	

}
