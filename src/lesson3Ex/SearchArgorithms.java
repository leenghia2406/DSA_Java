package lesson3Ex;

public class SearchArgorithms {
	public static int linearSearch(int[]arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int[]arr, int value) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == value) {
				return mid;
			}else if(arr[mid] > value) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]arr = {1, 2, 3, 4, 5, 7};
		int n = 3;
		System.out.println(linearSearch(arr, n));
		System.out.println(binarySearch(arr, n));
	}
}
