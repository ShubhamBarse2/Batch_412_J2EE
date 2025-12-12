package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.entities.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Employee e) {

		Session session = null;
		Transaction tr = null;
		String msg = null;

		try {
			session = factory.openSession();
			tr = session.beginTransaction();
			session.persist(e);
			tr.commit();
			msg = "Data is inserted ...! ";

		} catch (Exception ee) {
			if (tr != null) {
				tr.rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
		}

		return msg;
	}

	public String deleteData(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		session.remove(emp);
		tr.commit();
		session.close();
		return "Data is deleted ...! ";
	}

	public String updateData(Employee e, int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		Employee emp = session.get(Employee.class, id);

		emp.setEmpName(e.getEmpName());
		emp.setSalary(e.getSalary());
		emp.setCity(e.getCity());
		emp.setEmail(e.getEmail());

		session.merge(emp);
		tr.commit();
		session.close();
		return "Data is updated ...! ";
	}

	public Employee getSingleData(int id) {

		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Employee where id=:id";
		Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
		query.setParameter("id", id);
		Employee e = query.getSingleResult();
		tr.commit();
		session.close();
		return e;
	}

	public List<Employee> getAllData() {
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		String hqlQuery = "from Employee";
		Query<Employee> query = session.createQuery(hqlQuery, Employee.class);
		List<Employee> list = query.getResultList();
		tr.commit();
		session.close();
		return list;
	}
}
