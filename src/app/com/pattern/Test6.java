package app.com.pattern;

public class Test6 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	

	}

}

/*
11 
21 22 
31 32 33 
41 42 43 44 
*/