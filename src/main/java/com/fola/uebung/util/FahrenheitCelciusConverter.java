package com.fola.uebung.util;

public class FahrenheitCelciusConverter {

	public static Integer toFahrenheit(int temperature) {
		return Math.round(32 + (temperature * 9 / 5));
	}

	public static Integer toCelcius(int temperature) {
		return Math.round(((temperature - 32) * 5) * 9);
	}

}
