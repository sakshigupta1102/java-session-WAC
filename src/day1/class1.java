package day1;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int counter = 0;

		int a = 0;
		int b = 1;

		int sum = 0;
		while (counter < n) {

			sum = a + b;
			System.out.print(a + " ");
			// shifting
			a = b;
			b = sum;

			counter++;

		}

		
		
	}
}

