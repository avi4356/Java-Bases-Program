package app.com.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounterNumberArray {
	int a[] = new int[10];
	int key;

	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 No:-");
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter no to find frequency:-");
		key = sc.nextInt();
		sc.close();
	}

	void Count() {
		int Count = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == key) {
				Count = Count + 1;
			}
		}
		System.out.println("frequency:   " + "   Key:   ");
		System.out.println(key + "                " + Count);
	}

	public static void main(String[] args) {
		FrequencyCounterNumberArray fc = new FrequencyCounterNumberArray();
		fc.getData();
		fc.Count();
	}
}