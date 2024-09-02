package app.com.Array;

import java.util.Arrays;

public class LargestInArrayExample {
	// easy way------------------------------------------------
	public static int getLargest1(int[] a, int total) {
		Arrays.sort(a);
		return a[total - 1];
		// return a[total - 2];
		// return a[total - 3];
	}
	
	
	// Intermediate way------------------------------------------------
	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 1];
		// return a[total - 2];
		// return a[total - 3];
		//return a[0];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Largest: " + getLargest(a, 6));
		System.out.println("Largest: " + getLargest(b, 7));
	}

}