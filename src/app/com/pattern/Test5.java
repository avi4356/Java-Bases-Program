package app.com.pattern;
public class Test5 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		/*for(int j =1; j<=n; j++) {
			if(!(j<=n-i)) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("");
		*/
	}
}

/*
   *
  **
 ***
****
*/