package app.com.pattern;
import java.util.Scanner;

public class Arrays2D {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		String s = sc.next();
		int[][] numbers = new int[row][col];
		int[][] numbers1 = new int[row][col];
		int[][] numbers3 = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		/*
		 * for (int i = 0; i < row; i++) { for (int j = 0; j < col; j++) {
		 * System.out.print(numbers[i][j] + "  " );
		 * 
		 * } System.out.println(""); }
		 */
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				numbers1[i][j] = sc.nextInt();
			}
		}
		for(int i = 0 ; i<row; i++) {
			for(int j =  0; j<col*2+1; j++) {				
				if(i==row/2 && j==col) {
					System.out.print(s);						
				
				}else if((i==i && j==col)){
					System.out.print(" ");	
				}else {
					if(j<col) {
					System.out.print(numbers[i][j] + " ");	
					}
					else {if(j!=col)
						System.out.print(numbers1[i][j-col-1] + " ");	
					}
				}
			}System.out.println("");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				System.out.print(numbers1[i][j] + "+" + numbers[i][j]);	
				
			}
			System.out.println("");
		}
		/*
		 * for (int i = 0; i < row; i++) { for (int j = 0; j < col; j++) {
		 * 
		 * System.out.print(numbers1[i][j] + "  " );
		 * 
		 * } System.out.println(""); }
		 */
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <col; j++) {
				numbers3[i][j] = numbers1[i][j] + numbers[i][j];
				System.out.print(numbers3[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
}
