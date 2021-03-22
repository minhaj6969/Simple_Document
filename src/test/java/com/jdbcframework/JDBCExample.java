package com.jdbcframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:orcle:thin@localhost:49161","hr","hr");
		
		Statement stmt =con.createStatement();
		
		// Username = mercury2 and Password = mercury2
		String str = "insert into users value(102, 'mercury2','mercury2')";	
		
		stmt.executeQuery("str");
		
		
		con.close();
		
		System.out.println("program is executed");

	}

}
