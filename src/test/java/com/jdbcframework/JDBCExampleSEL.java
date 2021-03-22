package com.jdbcframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExampleSEL {

	public static void main(String[] args) throws SQLException {
		
	        Connection con = DriverManager.getConnection("");
			
			Statement stmt =con.createStatement();
			
			
			String str = "Select uname,passwrd from users";	
			
			
			ResultSet rs = stmt.executeQuery("str"); //Result set because retrieving data
			
			while(rs.next()){
				
				String username = rs.getString("uname");
				String password = rs.getString("paswrd");
				System.out.println(username);
				System.out.println(password);
			} 
			
			
			
			con.close();
			
			System.out.println("program is executed");

	}

}
