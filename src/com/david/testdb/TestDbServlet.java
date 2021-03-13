package com.david.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//set up connection variables
		
		String user = "root";

		String pass = "rootadmin";
		
		//connection url
		String jdbcUrl = "jdbc:mysql://localhost:3306/customer_db?useSSL=false&serverTimezone=UTC";
		
		
		//connection to DB
		
		
		try {
			
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database at: " +jdbcUrl);
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
;			Connection newConn = DriverManager.getConnection(jdbcUrl, user,pass);
			
			out.println("Success!!");
			
			newConn.close();
			
			
			
		}catch (Exception e) {
			
			System.out.println("wrong creddentials");;
			throw new ServletException(e);
		}
		
		
	}

}
