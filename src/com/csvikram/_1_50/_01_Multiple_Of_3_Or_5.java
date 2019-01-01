package com.csvikram._1_50;

import java.util.Scanner;

public class _01_Multiple_Of_3_Or_5 {

	/**
	 * Problem description:
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of
	 * these multiples is 23.
	 * <p>
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */

	public static void main(String[] args) {
		System.out.printf("Sum of multiple of 3 or 5 below 1000 is %d\n", findSumOfMultipleOf3Or5(1000));
		System.out.printf("Sum of multiple of 3 or 5 below 1000 is %d\n", findSumOfMultipleOf3Or5UsingAP(1000));
	}

	private static long findSumOfMultipleOf3Or5(long n) {

		long sum = 0;
		for (long i = 1; i < n; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}

	private static long findSumOfMultipleOf3Or5UsingAP(long n) {
		long lastMultipleOf3 = n - 1;
		long lastMultipleOf5 = n - 1;
		long lastMultipleOf15 = n - 1;
		while (lastMultipleOf3 % 3 != 0)
			lastMultipleOf3--;
		while (lastMultipleOf5 % 5 != 0)
			lastMultipleOf5--;
		while (lastMultipleOf15 % 15 != 0)
			lastMultipleOf15--;
		return findAPSum(3, lastMultipleOf3) + findAPSum(5, lastMultipleOf5) - findAPSum(15, lastMultipleOf15);
	}

	private static long findAPSum(int firstTerm, long lastTerm) {
		//Difference of term is same as firstTerm
		return (lastTerm) / firstTerm * (lastTerm + firstTerm) / 2;
	}
}
