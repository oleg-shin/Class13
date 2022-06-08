package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Batch 13 is great but I say this to every batch. I was kidding";
		System.out.println(str.length()); // checks the length of the string
		System.out.println(str.toUpperCase()); // convert to upper case whole string
		System.out.println(str.isEmpty()); // check if its empty
		String str2 = " aa  ";
		System.out.println(str2.trim()); // extract all spaces from the beginig and the end of the string
		System.out.println(str.contains("z")); // check if "z" contains inside the string
		System.out.println(str.startsWith("Batch")); // checks if it's starts from ""
		System.out.println(str.endsWith("ing")); // check if it's ends with ""
	}

}
