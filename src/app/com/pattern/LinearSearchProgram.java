package app.com.pattern;
import java.util.Scanner;

public class LinearSearchProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int number[] = new int[size];
		
		//input
		for(int i = 0; i<10; i++) {
			number[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		for(int i = 0; i<number.length; i++) {
			if(number[i] == x) {
			System.out.println("x found at index x:---  " + i);
			}
		}
}

}
