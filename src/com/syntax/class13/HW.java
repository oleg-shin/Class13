package com.syntax.class13;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 */

		String str = "I am learning Java";
		System.out.println(str.replaceAll("[ ]", ""));

		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many Alphanumeric characters are there in the
		 * String.
		 */

		String str1 = "AYdAIONFDfmpsg123544375@$%^&*()!@";

		System.out.println(str1.replaceAll("[^A-Za-z0-9]", "").length());

		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */

		String str2 = "Is it Saturday? Is it raining? Do we have a Java Class today?";
		int count = 0;
		for (int a = 0; a < str2.length(); a++) {
			if (str2.charAt(a) == '?') {
				count++;
			}
		}
		System.out.println(count);
		
		/*
		 * How would you reverse a String word by word? for example // input=>This is
		 * sentence i want to reverse // output=>sihT si ecnetnes i tnaw ot esrever
		 */

		String input = "This is sentence I want to reverse";
		for (int a = input.length() - 1; a >= 0; a--) {
			System.out.print(input.charAt(a));
		}
		System.out.println();
		// How would you check if String is palindrome or not? aba=> true Abbc =>false

		Scanner sc = new Scanner(System.in);
		System.out.println("in:");
		String in = sc.nextLine();
		String out = "";
		boolean pallindrome = true;
		for (int a = in.length() - 1; a >= 0; a--) {
			out = in.charAt(a) + out;
		}
		if (out.equalsIgnoreCase(in)) {
			pallindrome = true;

		} else {
			pallindrome = false;
		}
		System.out.println(pallindrome);

		// How would you swap 2 strings without a temporary variable?

		String str3 = "I'm trying to learn Java";
		String str4 = "I'm learning Java";
		str3 = str3 + str4;
		str4 = str3.substring(0, str3.length() - str4.length());
		str3 = str3.substring(str4.length());
		System.out.println(str3);
		System.out.println(str4);

	}
}
