package lesson2Ex;

public class RecursivePart1 {
	public static int factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		if (n < 2) {
			return 1;
		}else {
			return n * factorial(n - 1); 
		}
	}
	public static String decToBinary(int decNum) {
		if (decNum == 0) {
			return "0";
		}else if (decNum == 1) {
			return "1";
		}else {
			return "" + decToBinary(decNum / 2) + decNum % 2;
		}
	}
	public static int binaryToDec(String binNum) {
		if (binNum.length() == 1) {
			return Integer.parseInt(binNum);
		}else {
			int firstDigit = Integer.parseInt(binNum.substring(0, 1));
			String restString = binNum.substring(1);
			return firstDigit * (int) Math.pow(2, binNum.length() -1) 
					+ binaryToDec(restString);
		}
	}
	public static void main(String[] args) {
		int number = 5;
		System.out.println(number + " giai thua = " + factorial(number));
		System.out.println(number + " sang he nhi phan: " + decToBinary(number));
		System.out.println("101 sang he thap phan = " + binaryToDec("101"));
		System.out.println("Test with zero: ");
		System.out.println(factorial(0));
		System.out.println(decToBinary(0));
		System.out.println(binaryToDec("0"));
	}
}
