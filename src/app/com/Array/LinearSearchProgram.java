package app.com.Array;

import java.util.Scanner;

public class LinearSearchProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of the number:");
		int size = sc.nextInt();
		int number[] = new int[size];

		// input
		System.out.print("Enter the number:");
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		System.out.print("Enter the number you which number index are serach:");
		int x = sc.nextInt();
		for (int i = 1; i < number.length; i++) {
			if (number[i] == x) {
				System.out.println("x found at index x:---  " + i);
			}
		}
		System.out.println("Even number are serach:");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("x found at index even x:---  " + number[i]);
			}
		}
		System.out.println("Even number index are serach:");
		for (int i = 1; i < number.length; i = i + 2) {
			System.out.println("x found at index even x:---  " + number[i]);
		}
		System.out.println("Odd number  are serach:");
		for (int i = 0; i < number.length; i++) {
			if (!(number[i] % 2 == 0)) {
				System.out.println("x found at index Odd x:---  " + number[i]);
			}
		}
		System.out.println("Odd number index are serach:");
		for (int i = 0; i < number.length; i = i + 2) {
			System.out.println("x found at index Odd x:---  " + number[i]);
		}		
	}

}
