package com.atm.serviceimpl;

import org.junit.Test;
import static org.junit.Assert.*;

import com.atm.models.Account;

public class TranscatiionSercieImplTest {
	
	@Test
	public void testCreateAccount() {
		
		TranscatiionSercieImpl ts = new TranscatiionSercieImpl();
		
		Account a1 = new Account();
		Account a2 = new Account();
		Account a3 = new Account();
		
		a1.setAccountNo("123456A");
		a1.setAccountType("General");
		a1.setUser(14);
		a1.setUsername("user");
		a1.setPassword("pass");
		a1.setTotalBalance((long) 15000);
		
		a2.setAccountNo("123456");
		a2.setAccountType("General");
		a2.setUser(14);
		a2.setUsername("user");
		a2.setPassword("pass");
		a2.setTotalBalance((long) 15000);
		
		a3.setAccountNo("123456XXL");
		a3.setAccountType("General");
		a3.setUser(14);
		a3.setUsername("user");
		a3.setPassword("pass");
		a3.setTotalBalance((long) 15000);
		
		assertEquals(true, ts.createAccount(a1));
		assertTrue(ts.createAccount(a2));
		assertFalse(!ts.createAccount(a3));
	}
	
	@Test
	public void testGetUser(){
		TranscatiionSercieImpl ts = new TranscatiionSercieImpl();
		int uid = 1;
		int uid1 = 111;
		
		assertNotNull(ts.getByUser(uid));
		assertNull(ts.getByUser(uid1));
	}

}
