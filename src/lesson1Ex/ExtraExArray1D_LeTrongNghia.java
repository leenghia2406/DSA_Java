package lesson1Ex;

public class ExtraExArray1D_LeTrongNghia {
	// 1. SWITCH VALUE METHOD
	public static void switchValue(int[] array, int position1, int position2){
		int temp;
		temp = array[position1];
		array[position1] = array[position2];
		array[position2] = temp;
	}
	// 2. DELETE VALUE METHOD
	public static void delete(int[]array, int position) {
	    for (int i = position; i < array.length - 1; i++) {
	        array[i] = array[i + 1];
	    }	
	    // insert 0 at the end of the array (because 1 element has been removed)
	    array[array.length -1] = 0;
	}
	// DELETE VALUE METHOD RETURN ARRAY
	public static int[] delete2(int[] array, int position){
		for(int i = position; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		int newSize = array.length -1;
		int[] newArray = new int [newSize];
		for (int i = 0; i < array.length -1; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}
	// 3. INSERT VALUE METHOD
	public static void insert(int[] array, int position, int value){
		array[position] = value;
	}
	// 4. REVERSE ARRAY 1D METHOD
	public static void reverse(int[] array){
		int left = 0;
		int right = array.length -1;
		while(left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}
	// 5. FIND DUPLICATE TIMES METHOD
	public static int duplicateTimes(int[] array, int target) {
		int result = 0;
		for (int i : array) {
			if(i == target) {
				result++;
			}
		}
		return result;
	}
	// PRINT ARRAY METHOD
	public static void printArr(int []arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
		if(n == 1) {
			System.out.println("Di chuyen dia 1 tu coc "+ fromRod +" sang coc "+ toRod);
			return;
		}else {
			solveHanoi(n -1, fromRod, auxRod, toRod);
			System.out.println("Di chuyen dia "+ n +" tu coc "+ fromRod +" sang coc"+ toRod);
			solveHanoi(n -1, auxRod, toRod, fromRod);
		}
	}
	public static void main(String[] args) {
//		// test methods 1, 2, 3, 4
//		int[]arr = {1, 2, 3, 4, 5, 6};
////		switchValue(arr, 1, 3);
////		delete(arr, 3);
////		arr = delete2(arr, 3);
////		insert(arr, 2, 7);
//		reverse(arr);
//		printArr(arr);
//		System.out.println();
//		// test method 5
//		int []arr1 = {1,2,3,4,5,6,2,2}; 
//		System.out.println(duplicateTimes(arr1, 2));
		int n = 3;
		solveHanoi(n, 'A', 'C', 'B');
	}
}
