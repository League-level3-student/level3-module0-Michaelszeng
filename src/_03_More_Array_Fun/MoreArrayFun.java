package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] array = { "yes", "hi", "word", "thats enough words" };

		printRandomly(array);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void printStrings(String[] strings) {
		for (String s : strings) {
			System.out.println(s);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reversePrintStrings(String[] strings) {
		for (int i = strings.length - 1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void printEveryOther(String[] strings) {
		for (int i = 0; i < strings.length; i = i + 2) {
			System.out.println(strings[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void printRandomly(String[] strings) {
		Boolean[] printed = new Boolean[strings.length];
		for (int i = 0; i < printed.length; i++) {
			printed[i] = false;
		}
		int checker = 4;
		while (checker < 5) {
			boolean printedAll = true;
			Random ran = new Random();
			int ranInt = ran.nextInt(strings.length);
			if (printed[ranInt] == false) {
				System.out.println(strings[ranInt]);
				printed[ranInt] = true;
			}
			for (int i = 0; i < printed.length; i++) {
				if (printed[i] == false) {
					printedAll = false;
				}
			}
			if (printedAll == true) {
				checker = 6;
			}

		}
	}

}
