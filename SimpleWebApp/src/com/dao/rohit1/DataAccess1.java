package com.dao.rohit1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataAccess1 {
	
	public boolean authenticate(String userEmail,String userPwd){
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "java@123");
	
	String str = "select * from details where useremail=? AND userpwd=?";
	PreparedStatement ps = con.prepareStatement(str);
	
	ps.setString(1, userEmail);
	ps.setString(2, userPwd);
	
	ResultSet res = ps.executeQuery();
	
	if(res.next()) {
		return true;
	}
	
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
  }
	
	public boolean registartion(String firstName,String lastName,String course,String address,String contact ,String email) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521", "system", "java@123");
			
			String str = "insert into NEWSTUDENT values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(str);
			
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, course);
			ps.setString(4, address);
			ps.setString(5, contact);
			ps.setString(6, email);
			
			int result = ps.executeUpdate();
			if(result == 1) {
				return true;
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return false;
		
	}
}