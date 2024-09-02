package app.com.Array;

public class RemoveDuplicateElemant {

	public static void main(String[] args) {
		/*
		int j =0;
		int a[] = {1,2,2,3,4,5,5} ;
		//int temp[] = new int[a.length];
		for(int i= 0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length-1];
		for(int i=0;i<j+1;i++) {
			System.out.print(a[i] + " ");
		}
		*/
		//other way

		int j =0;
		int a[] = {1,2,2,3,4,5,5} ;
		int temp[] = new int[a.length];
		for(int i= 0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j] = a[i];
				j++;
			}
		}
		temp[j] = a[a.length-1];
		for(int i=0;i<j+1;i++) {
			System.out.print(temp[i] + " ");
		}	
	}

}
