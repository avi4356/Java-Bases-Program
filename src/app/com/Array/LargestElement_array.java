package app.com.Array;

public class LargestElement_array {  
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0]; 
        int max1 = arr[0]; 
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) {  
            //Compare elements of array with max  
           if(arr[i] > max) { 
               max = arr[i];  
           }else if(arr[i] < max1) {
        	   max1 = arr[i];  
           }
        }  
        System.out.println("Largest element present in given array: " + max);  
        System.out.println("Largest element present in given array: " + max1);  
        
        //Sum all array element present in given array in java  
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {  
          sum = sum+arr[i];
        }  
        System.out.println("Sum all array element present in given array: " + sum);  
    }  
}  