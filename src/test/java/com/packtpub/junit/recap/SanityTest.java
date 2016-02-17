package com.packtpub.junit.recap;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SanityTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("***Before Class is invoked");
	}

	@BeforeMethod
	public void before() {
		System.out.println("____________________");
		System.out.println("\t Before is invoked");
	}

	@AfterMethod
	public void after() {
		System.out.println("\t After is invoked");
		System.out.println("=================");
	}

	@Test
	public void someTest() {
		System.out.println("\t\t someTest is invoked");
	}

	@Test
	public void someTest2() {
		System.out.println("\t\t someTest2 is invoked");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("***After Class is invoked");
	}

}
