package com.fola.finance.dataaccess;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNull;

import java.math.BigDecimal;

import org.testng.annotations.AfterMethod;

public class ClientDAOTest {
	
	private ClientDAO sut;
	private long clientId;
	private BigDecimal bonus;
	
	@BeforeMethod
	public void beforeMethod() {
		sut = new ClientDAOImpl();
		clientId = 15L;
	}

	@AfterMethod
	public void afterMethod() {
	}

	@Test
	public void getClientType() {
		assertNull(sut.getClientType(clientId));
	}

	@Test
	public void saveBonusHistory() {
		bonus = BigDecimal.valueOf(100.45);
		assertFalse(sut.saveBonusHistory(clientId, bonus));
	}
}
