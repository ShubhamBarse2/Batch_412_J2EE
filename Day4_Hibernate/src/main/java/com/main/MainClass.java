package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Laptop;
import com.entities.Student;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Laptop l = new Laptop();
		l.setBrandName("HP");

		ss.persist(l);

		Student s = new Student();
		s.setStudID(122);
		s.setAge(25);
		s.setName("om");
		s.setCity("pune");
		s.setLap(l);

		ss.persist(s);

		System.out.println("Data is inserted ...! ");
		tr.commit();
		ss.close();

	}

}
