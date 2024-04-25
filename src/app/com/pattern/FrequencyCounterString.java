package app.com.pattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounterString {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a string:");
        String input = scanner.nextLine();
        scanner.close();

        int[] frequency = new int[256]; // Assuming ASCII characters

        // Counting frequencies
        for (int i = 0; i < input.length(); i++) {
        	//String ch = scanner.nextLine();
            char ch = input.charAt(i);
            frequency[ch]++;
        }

        // Printing frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("'" + (char) i + "': " + frequency[i]);
            }
        }
    }
}