package app.com.pattern;


public class Test4 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

/*
****
***
**
*
*/