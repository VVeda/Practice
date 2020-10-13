package com.java.main.practice;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		/*String str = "Testing";
		StringBuilder rev1 = new StringBuilder();
		rev1.append(str);
		rev1 = rev1.reverse();

		System.out.println(rev1);*/
		
		/*
		 * String str = "String to be revresd"; StringBuilder str1 = new
		 * StringBuilder(); str1.append(str); str1.reverse(); System.out.println(str +
		 * "==" + str1);
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the string to be reversed"); String str =
		 * sc.nextLine();
		 * 
		 * StringBuilder str1 = new StringBuilder(); str1.append(str); str1.reverse();
		 * System.out.println(str + "==" + str1);
		 */
		
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("enter the string to be reverese"); String str1 =
		 * sc.nextLine(); System.out.println("The string to be reverese ==  " + str1);
		 * StringBuilder str2 = new StringBuilder(); str2.append(str1); str2.reverse();
		 * System.out.println("The reversed string is === " + str2);
		 */
		
		int x,y,temp;
		
		System.out.println("enter the value of x and y");
		x = sc.nextInt();
		System.out.println(" befor x ==" + x);
		y =sc.nextInt();
		System.out.println(" before y ==" + y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println(" After swap x ==" + x);
		System.out.println(" After swap y ==" + y);
				
		
	}
}
