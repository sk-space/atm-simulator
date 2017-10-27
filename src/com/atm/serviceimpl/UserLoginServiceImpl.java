package com.atm.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.atm.db.DBConnection;
import com.atm.models.Account;
import com.atm.models.User;
import com.atm.services.UserLoginService;

public class UserLoginServiceImpl implements UserLoginService{

	Connection con = null;
	
	public UserLoginServiceImpl() {
		
		con = DBConnection.getDBConnetion();
		
	}

	@Override
	public int loginUser(String username, String password) {
		
//		System.out.println("This is inside ServiceImpl:");
//		System.out.println("Username: "+username);
//		System.out.println("Password: "+password);
		
		int id = 0;
		
		User u = new User();
		
		String sql = "SELECT * FROM account WHERE username = '"+username+"' AND password = '"+password+"' ";
		
		try {
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			System.out.println("This is after query execution.");
			if(rs.next()){
//				System.out.println(rs.getString("fname")+" "+rs.getString("lname"));
				return id = rs.getInt("user");
//				return id;
			}
			System.out.println("This is after rs display.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	@Override
	public User getById(int id) {
		
		Account a = new Account();
		
		System.out.println("This is inside getById(id)");
		System.out.println("ID: "+id);
		System.out.println("after display");

		User u = new User();
		
		String sqlu = "SELECT * FROM account INNER JOIN user ON  account.user = user.id WHERE user.id = '"+id+"' ";
//		String sqla = "SELECT * FROM account WHERE user = '"+id+"'";
		System.out.println(sqlu);
		try {
			Statement stm = con.createStatement();

			
			ResultSet rsu = stm.executeQuery(sqlu);
//			ResultSet rsa = stm.executeQuery(sqla);
//			String resu =  a.setAccountType(rsu.getString("accountType"));
			if(rsu.next()){
				
				u.setFname(rsu.getString("fname"));
				u.setLname(rsu.getString("lname"));
				u.setMname(rsu.getString("mname"));
				u.setGender(rsu.getString("gender"));
				u.setAddress(rsu.getString("address"));
				u.setCitizenship(rsu.getLong("citizenship"));
				
				a.setAccountType(rsu.getString("accountType"));
				a.setAccountNo(rsu.getString("accountNo"));
				a.setTotalBalance(rsu.getLong("totalBalance"));
				a.setLoan(rsu.getLong("loan"));

				u.setAccount(a);
			}
			
			return u;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public boolean updateUser(User u) {
		
		String sql = "UPDATE user SET fname = ?, mname = ?, lname = ?, gender = ?, address = ?, citizenship = ? WHERE id = ?";
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setString(1, u.getFname());
			pstm.setString(2, u.getMname());
			pstm.setString(3, u.getLname());
			pstm.setString(4, u.getGender());
			pstm.setString(5, u.getAddress());
			pstm.setLong(6, u.getCitizenship());
			
			pstm.setInt(7, u.getId());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
