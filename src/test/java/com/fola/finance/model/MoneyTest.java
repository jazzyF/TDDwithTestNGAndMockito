package com.fola.finance.model;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class MoneyTest {
	private final int amount = 250;
	private final String currency = "GBP";
	private final Money sut = new Money(amount, currency);

	@DataProvider
	private static final Object[][] getMoney() {
		return new Object[][] { { 10, "USD" }, { 20, "EUR" } };
	}

	@DataProvider
	private static final Object[][] getMoneyForNotEqualsTest() {
		return new Object[][] { { new Money(250, "USD"), null, new Money(150, "GBP") } };
	}

	@Test(dataProvider = "getMoney")
	public void equals(int amount, String currency) {
		Money sut = new Money(amount, currency);
		Money expectedResult = new Money(amount, currency);
		assertEquals(sut, expectedResult);
	}

	@Test(dataProvider = "getMoneyForNotEqualsTest")
	public void notEquals(Money money1, Money money2, Money money3) {
		assertNotEquals(sut, money1);
		assertNotEquals(sut, money2);
		assertNotEquals(sut, money3);
	}

	@Test
	public void testNullAndObjectNotEquals() {
		assertNotEquals(sut, null);
		assertFalse(sut.equals(new Object()));
	}

	public void getAmount() {
		int amount = 150;
		String currency = "EUR";
		Money sut = new Money(amount, currency);
		assertEquals(sut.getAmount(), amount);
	}

	public void getCurrency() {
		int amount = 150;
		String currency = "EUR";
		Money sut = new Money(amount, currency);
		assertEquals(sut.getCurrency(), currency);
	}

	@Test(dataProvider = "getMoney")
	public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
		Money sut = new Money(amount, currency);
		assertEquals(sut.getAmount(), amount);
		assertEquals(sut.getCurrency(), currency);
	}

}
