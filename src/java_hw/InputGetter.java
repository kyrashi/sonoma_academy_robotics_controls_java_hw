package java_hw;

import java.util.Scanner;

public class InputGetter {
	private static Scanner scanner = new Scanner(System.in);

	public static int getInt() {
		return scanner.nextInt();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}

	public static String getString() {
		return scanner.nextLine();
	}

	public static int toInt(String str) {
		return Integer.parseInt(str);
	}

	public static double toDouble(String str) {
		return Double.parseDouble(str);
	}

	public static String toStr(Object obj) {
		return String.valueOf(obj);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
