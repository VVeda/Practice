package com.java.main.practice;

public class Duplicate {

	public static void main(String[] args) {

		int[] dup = { 1, 2, 4, 3, 5, 6, 4, 2, 1 };

		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] == dup[j]) {
					System.out.println("duplicates are: " + dup[j]);
				}
			}
		}
	}
}