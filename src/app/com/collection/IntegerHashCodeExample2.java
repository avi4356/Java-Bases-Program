package app.com.collection;

import java.util.Scanner;

public class IntegerHashCodeExample2 {
	public static void main(String[] args) {
		// Create integer object
		System.out.print("Enter the desired input value: ");
		Scanner readInput = new Scanner(System.in);
		Integer i = readInput.nextInt();
		readInput.close();
		// Returned hash code value for this object
		int hashValue = i.hashCode();
		System.out.println("Hash code Value for object is: " + hashValue);
	}
}