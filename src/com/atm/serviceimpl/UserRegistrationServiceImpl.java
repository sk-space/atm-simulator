package com.atm.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.atm.db.DBConnection;
import com.atm.models.User;
import com.atm.services.UserRegistraionService;

public class UserRegistrationServiceImpl implements UserRegistraionService{

	Connection con = null;
	
	public UserRegistrationServiceImpl() {
		
		con = DBConnection.getDBConnetion();
		
	}
	
	@Override
	public int addUser(User u) {
		
		String sql = "INSERT INTO user (fname, mname, lname, gender, address, citizenship) VALUES (?, ?, ?, ?, ?, ?)";
		System.out.println(sql);
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setString(1, u.getFname());
			pstm.setString(2, u.getMname());
			pstm.setString(3, u.getLname());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getAddress());
			pstm.setLong(6, u.getCitizenship());

			pstm.execute();

			ResultSet result = pstm.getGeneratedKeys();
			while(result.next()){
				int id = result.getInt(1);
				System.out.println("THIS IS NEW id: "+id);
				
				return id;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
