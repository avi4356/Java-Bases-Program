package app.com.Array;

class RemoveDuplicate {
	public static void main(String[] args) {
		// Initialize array
		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		System.out.println("Remove Duplicate elements in given array: " + arr[i]);
	}
}
