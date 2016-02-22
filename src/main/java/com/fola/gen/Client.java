package com.fola.gen;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
	
	Collection<Address> addresses = new ArrayList<>();

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}

}
