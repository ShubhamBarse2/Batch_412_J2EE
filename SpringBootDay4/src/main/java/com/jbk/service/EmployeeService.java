package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.dao.EmployeeDao;
import com.jbk.entities.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;

	public String insertData(Employee e) {
		String msg = dao.insertData(e);
		return msg;
	}

	public String deleteData(int id) {
		String msg = dao.deleteData(id);
		return msg;
	}

	public String updateData(Employee e, int id) {
		String msg = dao.updateData(e, id);
		return msg;
	}

	public Employee getSingleData(int id) {
		Employee e = dao.getSingleData(id);
		return e;
	}

	public List<Employee> getAllData() {
		List<Employee> list = dao.getAllData();
		return list;
	}

}
