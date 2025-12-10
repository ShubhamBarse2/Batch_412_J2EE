package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(e);
		tr.commit();
		session.close();
		return "Data is inserted ...! ";
	}
}
