package app.com.String;
import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next(); 					// only one string print
		String name1 = sc.nextLine(); 				// full line print
		System.out.println(name + name1); 			// Concatenation method
		System.out.println(name1.length()); 		// length calculate
		for (int i = 0; i < name.length(); i++) {	// charAt() method used
			System.out.println(name.charAt(i));
		}

		// comapreTo : behalf of the first charectar
		// 1.s1>s2 : +ive value
		// 2.s1==s2: 0
		// 3.s1<s2: -ive value

		if (name.compareTo(name1) == 0) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}

		// ==

		if (name == name1) {
			System.out.println("String are equal");
		} else {
			System.out.println("String are not equal");
		}

		// subString() :

		String sentance = "my name is pawan";
		String sentance1 = "AvinashSingh";
		String name2 = sentance1.substring(7);
		System.out.println(name2);

		// String are immutable :- do not change string if any changes take new string
		// inside the java create two type of memory(heap and stack)
		// string builder deceleration in java

		StringBuilder sb = new StringBuilder("Avinash");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'p');
		System.out.println(sb);
		sb.insert(2, 'Z');
		System.out.println(sb);
		sb.delete(2, 3);
		System.out.println(sb);
		sb.append('h');
		sb.append('h');
		sb.append('h');
		sb.append('h');
		sb.append('h');
		System.out.println(sb);
		System.out.println(sb.length());

		// reverse string program
		StringBuilder sb1 = new StringBuilder("hello");
		for (int i = 0; i < sb1.length()/2; i++) {
			int front = i;
			int back = sb1.length() - 1 - i;
			char frontchar = sb1.charAt(front);
			char backchar = sb1.charAt(back);
			sb1.setCharAt(front, backchar);
			sb1.setCharAt(back, frontchar);

		}
		System.out.println(sb1);
	}

}
