package com.syntax.class13;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String father = "Blady";
		String mother = "Mary";
		boolean girl = true; // true girl, otherwise boy

		if (!girl) {
			String firstHalf = father.substring(0, father.length() / 2);
			String secondHalf = mother.substring(mother.length() / 2);
			System.out.println(firstHalf.concat(secondHalf));
			System.out.println(firstHalf.trim()+secondHalf.trim());
		} else {
			String firstHalf = mother.substring(0, mother.length() / 2);
			String secondHalf = father.substring(father.length() / 2);
			System.out.println(firstHalf.concat(secondHalf));
			System.out.println(firstHalf.trim()+secondHalf.trim());
		}
	}

}
