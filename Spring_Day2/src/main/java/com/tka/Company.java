package com.tka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("TCS")
	String name;
	@Value("Phase 3")
	String address;

	@Autowired
	Employee emp;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String address, Employee emp) {
		super();
		this.name = name;
		this.address = address;
		this.emp = emp;
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

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", address=" + address + ", emp=" + emp + "]";
	}

}
