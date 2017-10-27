package com.atm.services;

import com.atm.models.Account;

public interface TranscationService {

	public boolean createAccount(Account a);
	
	public Account getByUser(int user);
	
	public boolean depositAccount(int uid, long amount);
	
	public boolean withdrawAccount(int uid, long amount);
	
	public boolean applyLoan(int uid, long amount);
	
	public boolean payLoan(int uid, long amount);
	
}
