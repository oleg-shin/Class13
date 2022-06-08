package com.syntax.class13;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		String str2 = "Hello";

		if (!str2.isEmpty()) {
			if (str2.length() % 2 != 0 && str2.length() >=3) {
				int middle = str2.length() / 2;
				System.out.println(str2.charAt(middle));
			}
		}
		

	}

}
