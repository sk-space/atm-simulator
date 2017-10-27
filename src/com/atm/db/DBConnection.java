package com.atm.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection getDBConnetion(){
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_db", "root", "");
			
			return con;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
