package com.fola.gen;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class ClientTest {

	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");
	private Client client;

	@BeforeMethod
	public void setUp() {
		client = new Client();
	}

	public void afterCreationShouldHaveNoAddress() {
		assertEquals(client.getAddresses().size(), 0);
	}

	public void shouldAllowToAddAddress() {
		client.addAddress(addressA);
		assertEquals(client.getAddresses().size(), 1);
		assertTrue(client.getAddresses().contains(addressA));
	}

	public void shouldAllowToAddManyAddresses() {
		client.addAddress(addressA);
		client.addAddress(addressB);
		assertEquals(client.getAddresses().size(), 2);
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}

}
