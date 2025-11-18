package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDao {

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into student(id,name,city)values(1,'sunny','pune')");
		System.out.println("Data inserted...");
		c.close();

	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into student(id,name,city)values(1,'sunny','pune')");
		System.out.println("Data inserted...");
		c.close();

	}
}
