package com.syntax.class13;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Batch 13 is good, actually very good";
		System.out.println(str.replace("good","Great")); // replace first to second not permanently
		System.out.println(str.replace("g", "G")); // also replace all 
		System.out.println(str.replaceFirst("g","G")); // replace only first
		
	}

}
