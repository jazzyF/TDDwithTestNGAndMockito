package com.fola.uebung.util;

import java.util.HashMap;
import java.util.Map;

public class HashMapDecorator<K, V> {

	private Map<K, V> map = new HashMap<>();

	public void put(K key, V value) {
		map.put(key, value);
	}

	public V get(K key) {
		return map.get(key);
	}
	
	public void clear() {
		map.clear();
	}
	
	public int size() {
		return map.size();
	}

}
