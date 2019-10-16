package de.abas.com;

public class ZipCodeValidator {

	public boolean isGermanZipCode(String zipCode) {
		return zipCode.matches("[1-9][0-9]{4}");
	}
}
