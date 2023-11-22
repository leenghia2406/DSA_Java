package lesson1Ex;

public class Testt {
	public static boolean find(int n, int[]arr) {
		for (int i : arr) {
			if(i == n) {
				return true;
			}
		}
		return false;
	}
	public static String print(int []arr) {
		String res = " ";
		for (int i : arr) {
			res += i + " ";
		}
		return res;
	}
	public static  int sum (int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	public static double average(int []arr) {
		double result;
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		result = (double) sum / arr.length;
		return result;
	}
	public static int[] SelectionSort(int[] arr) {
	    int n = arr.length;
	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        // Swap the found minimum element with the element at index i
	        int temp = arr[i];
	        arr[i] = arr[minIndex];
	        arr[minIndex] = temp;
	    }
	    return arr;
	}
	public static void printArr(int[]arr) {
		for (int i : arr) {
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int [] arr1 = {5, 3, 2, 9, 1};
		System.out.println(find(5, arr));
		System.out.println(print(arr));
		System.out.println(sum(arr));
		System.out.println(average(arr));
		printArr(SelectionSort(arr1));
	}
}
