package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class UpdateData {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		int stud_id = 1;
		Student s = ss.get(Student.class, stud_id);

		s.setAge(29);
		s.setCity("nsk");
		s.setName("amol");

//		ss.update(s);
		ss.merge(s);

		System.out.println("Data id udated ... ! ");
		tr.commit();
		ss.close();

	}

}
