package com.fola.uebung.util;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

@Test
public class HashMapDecoratorTest {

	HashMapDecorator<Object, Object> sut;
	
	@BeforeMethod
	public void beforeMethod() {
		sut = new HashMapDecorator<>();
	}

	
	public void clear() {
		assertEquals(sut.size(), 0);
		
		sut.put("Key1", new Object());
		sut.put("Key2", new Object());
		
		assertEquals(sut.size(), 2);
		
		sut.clear();
		
		assertEquals(sut.size(), 0);
	}

	public void getAndPut() {
		Object expectedResult = new Object();
		Object key = "foo";
		
		sut.put(key, expectedResult);
		
		Object actualResult = sut.get(key);
		
		assertEquals(actualResult, expectedResult);
		
	}

	public void nullIsValidKey() {
		Object key = null;
		Object value = "bar";
		
		sut.put(key, value);
		
		Object actualResult = sut.get(key);
		
		assertEquals(actualResult, value);
	}
	
}
