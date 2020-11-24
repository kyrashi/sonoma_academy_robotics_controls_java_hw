package java_hw;

import java.util.List;
import java.util.ArrayList;

public class Homework2 {

// TESTERS:

	public static void main(String[] args) {

		// LEVEL #1
		System.out.print("enter number to see if it's prime: ");
		int input1 = InputGetter.getInt();
		boolean answer1 = isPrime(input1, true);
		System.out.println("prime: " + answer1);

		// LEVEL #2
		System.out.print("enter number to see how many prime numbers exist below it: ");
		int input2 = InputGetter.getInt();
		List<Integer> primelist = primeList(input2);
		int count2 = primelist.size();
		System.out.println("prime list: " + primelist);
		System.out.println("count: " + count2);

		// LEVEL #3
		System.out.print("enter number to see how many prime numbers exist below it that also have a digit sum that is divisible by 10: ");
		int input3 = InputGetter.getInt();
		List<Integer> finallist = finalList(input3);
		int count3 = finallist.size();
		System.out.println("final list: " + finallist);
		System.out.println("count: " + count3);

	}

// FUNCTIONS:

	// LEVEL #1:
	public static boolean isPrime(int num, boolean print) {

		if (num < 2) {
			return false;
		}

		for (int i = 2; i < num; i = i + 1) {
			int r = num % i;

			if (r == 0) {
				if (print) {
					int d = num / i;
					System.out.println("factor #1: " + i + "\n" + "factor #2: " + d);
				}
				
				return false;
			}
		}

		return true;
	}

	// LEVEL #2:
	public static List primeList(int num) {

		List<Integer> primeList = new ArrayList<>();

		if (num < 2) {
			return primeList;
		}

		for (int i = 2; i < num; i = i + 1) {
			
			if (isPrime(i, false)) {
				primeList.add(i);
			}
		}

		return primeList;
	}

	// LEVEL #3:
	public static int digitSum(int num) {

		int sum = 0;

		while (num >= 10) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}

		sum = sum + num;
		return sum;
	}

	public static List finalList(int num) {

		List<Integer> primelist = primeList(num);
		List<Integer> finallist = new ArrayList<>();

		for (int i : primelist) {
			
			int digitsum = digitSum(i);
			int r = digitsum % 10;

			if (r == 0) {
				finallist.add(i);
			}
		}

		return finallist;
	}

}
