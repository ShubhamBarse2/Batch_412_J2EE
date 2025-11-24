package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname = request.getParameter("fullname");
		String myEmail = request.getParameter("email");
		String myPass = request.getParameter("password");
		String city = request.getParameter("city");
		String mobNo = request.getParameter("phone");
		long phoneNo = Long.parseLong(mobNo);

//		System.out.println(fname);
//		System.out.println(myEmail);
//		System.out.println(myPass);
//		System.out.println(city);
//		System.out.println(phoneNo);
//
		PrintWriter out = response.getWriter();
//		out.println("<h1 style = 'color: red'>" + fname + "</h1>");
//		out.print(myEmail);
//		out.print(myPass);
//		out.print(city);
//		out.print(phoneNo);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
			PreparedStatement ps = c
					.prepareStatement("insert into studentRecord(name,email,password,city,MobileNO)values(?,?,?,?,?);");

			ps.setString(1, fname);
			ps.setString(2, myEmail);
			ps.setString(3, myPass);
			ps.setString(4, city);
			ps.setLong(5, phoneNo);

			int check = ps.executeUpdate();

			if (check > 0) {
				System.out.println("Register Successfully ... !");
				out.println("<h1 style = 'color:green'>" + "Register Successfully ... !" + "</h1>");
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);

			} else {
				System.out.println("Not Register...!");
				out.println("<h1 style = 'color:red'>" + "Not Register...!" + "</h1>");
			}

		} catch (Exception e) {

		}

	}

}
