package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		String jdbcUrl ="jdbc:mysql://localhost:3306/student_tracker?useSSL=false";
		String usr = "Studentuser";
		String pwd ="Student@123";
		try {
			System.out.println("connecting to database:"+jdbcUrl);
			Connection con= DriverManager.getConnection(jdbcUrl,usr,pwd);
			System.out.println("Connected successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}