package com.atm.models;

public class Account {

	private int id;
	private String accountType;
	private String accountNo;
	private String username;
	private String password;
	private Long totalBalance;
	private Long loan;
	private int uid;
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUser() {
		return uid;
	}
	public void setUser(int uid) {
		this.uid = uid;
		System.out.println("This inside setter."+this.uid);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Long getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(Long totalBalance) {
		this.totalBalance = totalBalance;
	}
	public Long getLoan() {
		return loan;
	}
	public void setLoan(Long loan) {
		this.loan = loan;
	}
	
}
