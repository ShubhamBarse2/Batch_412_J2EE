package com.tka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out = resp.getWriter();
		String email = req.getParameter("email");
		String pass = req.getParameter("password");

		resp.setContentType("text/html");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch412", "root", "root");
			PreparedStatement ps = c.prepareStatement("select * from studentrecord where email=? AND password =?;");
			ps.setString(1, email);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login Successfully ... !");
				out.println("<h1 style = 'color:green'>" + "Login Successfully ... !" + "</h1>");

//				String s = req.getParameter("search");
//				resp.sendRedirect("https://www.google.com/");

				HttpSession session = req.getSession();
				session.setAttribute("name", rs.getString(1));
				session.setAttribute("email", rs.getString(2));
				session.setAttribute("city", rs.getString(4));
				session.setAttribute("mobNo", rs.getLong(5));

				RequestDispatcher rd1 = req.getRequestDispatcher("profile.jsp");
				rd1.include(req, resp);

			} else {
				System.out.println("INVALID CREDENTIALS...!");
				out.println("<h1 style = 'color:red'>" + "INVALID CREDENTIALS ...!" + "</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("register.html");
				rd.include(req, resp);
			}
		} catch (Exception e) {

		}
	}
}
