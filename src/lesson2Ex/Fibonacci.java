package lesson2Ex;

public class Fibonacci {
	public static int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n -2);
		}
	}
	public static void main(String[] args) {
		int num = 8;
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}
	
}
