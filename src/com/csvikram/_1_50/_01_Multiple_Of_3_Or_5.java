package com.csvikram._1_50;

import java.util.Scanner;

public class _01_Multiple_Of_3_Or_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = scan.nextLong();
		System.out.printf("Sum is %d\n", findSumOfMultipleOf3Or5(n));
	}

	private static long findSumOfMultipleOf3Or5(long n) {

		long sum = 0;
		for (long i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
}
