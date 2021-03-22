package com.jdbcframework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class JDBCExampleSelenium {

	public static void main(String[] args) throws SQLException {
		
		System.setProperty("webdriver.gecko.driver","./Browser/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Connection con = DriverManager.getConnection("jdbc:orcle:thin@localhost:49161","hr","hr");
		
		Statement stmt =con.createStatement();
		
		
		String str = "Select uname,passwrd from users";	
		
		
		ResultSet rs = stmt.executeQuery("str"); //Result set because retrieving data
		
		while(rs.next()){
			
			String username = rs.getString("uname");
			String password = rs.getString("paswrd");
			
			driver.findElement(By.name(username)).sendKeys(username);
			driver.findElement(By.name(password)).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().equals("Find a Flights: Mercury Tours:")){
				
				System.out.println("Test is passed");
			}
			else{
				
				System.out.println("Test is failed");
			}
			
			driver.findElement(By.linkText("Home")).click();
			
		} 

	}

}
