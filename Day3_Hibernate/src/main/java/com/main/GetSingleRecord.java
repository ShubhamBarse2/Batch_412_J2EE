package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entities.Student;

public class GetSingleRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int studID = 3;
		String hqlQuery = "from Student where studID =:studID";
		Query<Student> query = ss.createQuery(hqlQuery, Student.class);
		query.setParameter("studID", studID);

		Student s = query.getSingleResult();
		System.out.println(s);
	}

}
