package thursdaylab;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		int sum = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			sum += lastDigit;
			number = number / 10;
		}
		System.out.println("The sum of the digits is " + sum);
	}
}
