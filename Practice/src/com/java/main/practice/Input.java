package com.java.main.practice;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/*
		 * int a = 5; int b = 9; if ((b=3) ==a) System.out.println(b); else {
		 * System.out.println(++b); }
		 */
		int a, b;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the value of a");
		a = in.nextInt();

		System.out.println("Enter the value of b");
		b = in.nextInt();

		System.out.println("Output is :" + (a * b));
	}
}
