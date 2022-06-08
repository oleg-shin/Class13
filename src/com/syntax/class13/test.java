package com.syntax.class13;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str3 = "I'm trying to learn Java";
		String str4 = "I'm learning Java";
		str3 = str3+str4;
		str4 = str3.substring(0,str3.length()-str4.length());
		str3 = str3.substring(str4.length());
		System.out.println(str3);
		System.out.println(str4);
	}

}
