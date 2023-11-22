package lesson3Ex;

public class SortArgorithms {
	public static int[] selectionSort(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
	public static int[] bubbleSort(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] insertionSort(int[]arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	public static void printArr(int[]arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int[]arr = {1, 19, 12, 21, 59, 5};
		printArr(selectionSort(arr));
		System.out.println();
		printArr(bubbleSort(arr));
		System.out.println();
		printArr(insertionSort(arr));
	}
}
