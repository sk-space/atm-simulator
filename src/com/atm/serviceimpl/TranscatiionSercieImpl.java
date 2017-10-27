package com.atm.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.atm.clients.UserProfile;
import com.atm.clients.WithdrawAccount;
import com.atm.db.DBConnection;
import com.atm.models.Account;
import com.atm.services.TranscationService;

public class TranscatiionSercieImpl implements TranscationService{
	
	Account a = new Account();
	
	Connection con = null;
	
	private int uid;
	
	public TranscatiionSercieImpl() {

		con = DBConnection.getDBConnetion();
		
	}

	@Override
	public boolean createAccount(Account a) {
		
		uid = a.getUser();
		
		String sql = "INSERT INTO account (user, accountType, accountNo, username, password, totalBalance) VALUES (?, ?, ?, ?, ?, ?)";

		System.out.println("This after account id setter."+a.getUser());
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, (Integer) a.getUser());
			pstm.setString(2, a.getAccountType());
			pstm.setString(3, a.getAccountNo());
			pstm.setString(4, a.getUsername());
			pstm.setString(5, a.getPassword());
			pstm.setLong(6, a.getTotalBalance());
//			pstm.setLong(7, a.getLoan());
			
			pstm.execute();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Account getByUser(int user) {
		
		String sql = "SELECT * FROM account WHERE user = '"+user+"'";
		
		try {
			Statement stm = con.createStatement();
			
			ResultSet rs = stm.executeQuery(sql);
			
			if(rs.next())
				a.setTotalBalance(rs.getLong("totalBalance"));
				a.setLoan(rs.getLong("loan"));
			
			return a;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean depositAccount(int uid, long amount) {

		a = getByUser(uid);
		Long newBalance = a.getTotalBalance()+amount;
		a.setTotalBalance(newBalance);
		
		System.out.println("Inside IMPL UID: " + uid+" And Deposit: "+amount+" ABAL: "+newBalance);
		
		String sql = "UPDATE account SET totalBalance = ? WHERE user = '"+uid+"' ";
//		String sql = "UPDATE user SET fname = ?, mname = ?, lname = ?, gender = ?, address = ?, citizenship = ? WHERE id = ?";
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setLong(1, a.getTotalBalance());
//			pstm.setInt(8, a.getUser());
			
			pstm.execute();
			
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean withdrawAccount(int uid, long amount) {
		
		System.out.println("Amount: "+amount+" ID: "+uid);
		
		a = getByUser(uid);
		
		Long newBalance = a.getTotalBalance() - amount;
		if(newBalance < 1000){
			long drawableBalance = a.getTotalBalance() - 1000;
			JOptionPane.showMessageDialog(null, "Minimum Balance Rule Violated i.e. NRs. 1000. \n Your maximum drawable balance is "+drawableBalance);
//			new WithdrawAccount();
//			dispose();
			
			return false;
		}
		a.setTotalBalance(newBalance);
		
		String sql = "UPDATE account SET totalBalance = ? WHERE user = '"+uid+"'";
		
		try {
			PreparedStatement pstm = con.prepareStatement(sql);
			
			pstm.setLong(1, a.getTotalBalance());
			
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean applyLoan(int uid, long amount) {

		System.out.println("Apply Inside: " + amount + " By: "+ uid);
		a = getByUser(uid);
		
//		String loa = a.getLoan().toString();
//		System.out.println("Previous Loan: "+loa);
		if(a.getLoan() <= 10){
			Long newLoan = a.getLoan() + amount;
			a.setLoan(newLoan);
			String sql = "UPDATE account SET loan = ? WHERE user = '"+ uid+"'";
			
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				pstm.setLong(1, a.getLoan());
				
				pstm.execute();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}else{
			JOptionPane.showMessageDialog(null, "Please pay previous loan to apply for new loan.\n\nMaximum Previous Loan Margin is NRs. 10");
			return false;
		}
			
		
		return false;
	}

	@Override
	public boolean payLoan(int uid, long amount) {
		
		a = getByUser(uid);
		
		Long newLoan = a.getLoan() - amount;
		if(newLoan >= 0){
			a.setLoan(newLoan);
			
			String sql = "UPDATE account SET loan = ? WHERE user = '"+uid+"'";
			
			try {
				PreparedStatement pstm = con.prepareStatement(sql);
				
				pstm.setLong(1, a.getLoan());
				pstm.execute();
				return true;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
