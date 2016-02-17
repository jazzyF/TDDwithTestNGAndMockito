package com.fola.finance.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fola.finance.dataaccess.ClientDAO;
import com.fola.finance.util.Calculator;

public class FinancialServiceTest {
	@InjectMocks
	private FinancialService sut;
	private BigDecimal payment;
	private long clientId;
	private Short clientType;
	@Mock
	private Calculator calculator;
	@Mock
	private ClientDAO clientDAO;

	@BeforeMethod
	public void setUp() {
		sut = new FinancialServiceImpl();
		initMocks(this);
	}

	@Test
	public void calculateBonusShouldReturnCorrectBonusForValidId() {
		clientType = 1;
		clientId = 15543L;
		payment = BigDecimal.valueOf(35000);
		BigDecimal expectedBonus = BigDecimal.valueOf(1000);
		when(clientDAO.getClientType(clientId)).thenReturn(clientType);
		when(calculator.calculateBonus(clientType, payment)).thenReturn(expectedBonus);
		BigDecimal result = sut.calculateBonus(clientId, payment);
		verify(clientDAO).getClientType(clientId);
		verify(clientDAO).saveBonusHistory(clientId, result);
		assertEquals(expectedBonus, result);
	}
}
