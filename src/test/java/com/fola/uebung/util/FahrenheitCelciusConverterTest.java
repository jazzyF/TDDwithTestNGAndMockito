package com.fola.uebung.util;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class FahrenheitCelciusConverterTest {

	@DataProvider
	public Object[][] getCelciusAndFahrenheitData() {
		return new Object[][] { new Object[] { 0, 32 }, new Object[] { 37, 98 }, new Object[] { 100, 212 } };
	}

	@Test(dataProvider = "getCelciusAndFahrenheitData")
	public void shouldConvertFahrenheitToCelcius(Integer celsius, Integer fahrenheit) {
		assertEquals(FahrenheitCelciusConverter.toCelcius(fahrenheit), celsius);
	}

	@Test(dataProvider = "getCelciusAndFahrenheitData")
	public void shouldConvertCelciusToFahrenheit(Integer celsius, Integer fahrenheit) {
		assertEquals(FahrenheitCelciusConverter.toFahrenheit(celsius), fahrenheit);
	}
}
