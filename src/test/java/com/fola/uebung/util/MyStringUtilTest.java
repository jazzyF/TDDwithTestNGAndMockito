package com.fola.uebung.util;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
public class MyStringUtilTest {

	@Test(dataProvider = "getStringsAndReversedStringsValid")
	public void reverseValid(String testValue, String expectedResult) {

		String actualResult = MyStringUtil.reverse(testValue);

		assertEquals(actualResult, expectedResult);
	}

	@Test(dataProvider = "getStringsAndReversedStringsInValid")
	public void reverseInValid(String testValue, String expectedResult) {

		String actualResult = MyStringUtil.reverse(testValue);

		assertNotEquals(actualResult, expectedResult);
	}

	@Test(dataProvider = "getValuesForExceptions", expectedExceptions = NullPointerException.class)
	public void reverseShouldThrowExceptions(String testValue, String expectedResult) {

		String actualResult = MyStringUtil.reverse(testValue);

		assertNotEquals(actualResult, expectedResult);
	}

	@DataProvider
	private static final Object[][] getStringsAndReversedStringsValid() {
		return new String[][] { { "Deuece", "eceueD" }, { "Foo bar", "rab ooF" }, { " ", " " }, { "", "" },
				{ " Begins with a space", "ecaps a htiw snigeB " }, { "Ends with a space ", " ecaps a htiw sdnE" } };
	}

	@DataProvider
	private static final Object[][] getStringsAndReversedStringsInValid() {
		return new String[][] { { "Deuece", "Deuece" }, { "Foo bar", "ooF rab" }, { "   ", " " }, { "Foo bar", null },
				{ " Begins with a space", "ecaps a htiw snigeB" }, { "Ends with a space ", " ecaps ahtiw sdnE" } };
	}

	@DataProvider
	private static final Object[][] getValuesForExceptions() {
		return new String[][] { { null, "eceueD" }, { null, null } };
	}

}
