package com.syntax.class13;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sfadfsahfuhdSADNUSA321432!@#$%^&*()";
		System.out.println(str.replaceAll("[0-9]", "#")); // replace all number to #
		System.out.println(str.replaceAll("[a-z]", "#")); // replace all letters to #
		System.out.println(str.replaceAll("[A-Z]", "#")); // replace all upper case letter
		System.out.println(str.replaceAll("[A-Za-z]", "#")); // replace all upper and lower case letters
		System.out.println(str.replaceAll("[A-Za-z0-9]", "#")); // replace all upper
		System.out.println(str.replaceAll("[^a-z]", "_")); // replace everything except lower case letters
		System.out.println(str.replaceAll("[^A-Z]", "*")); // replace everything except upper case letters
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*")); //except special characters
		System.out.println(str.replaceAll("[^A-Za-z0-9]", "*"));
		System.out.println(str.replaceAll("[^A-z]", "")); //removes special characters
	}

}
