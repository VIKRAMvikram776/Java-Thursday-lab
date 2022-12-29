package thursdaylab;

import java.util.Scanner;

public class decimalTobinary {
	public static void main(String[] args) {
		System.out.println("Enter the decimal number to convert ");
		Scanner sc = new Scanner(System.in);
		int decimalNumber = sc.nextInt();
		int[] binaryNumber = new int[8];
		int i = 0;// counter for binary array
		while (decimalNumber > 0) {
			binaryNumber[i] = decimalNumber % 2;// storing remainder in binary array
			decimalNumber = decimalNumber / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--) // printing binary array in reverse order
			System.out.print(binaryNumber[j]);
		sc.close();
	}
}
