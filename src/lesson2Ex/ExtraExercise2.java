package lesson2Ex;

public class ExtraExercise2 {
	// Question 1 decimal to binary use recursive
	public static String decToBin(int decNum) {
		if (decNum == 1) {
			return "1";
		}else {
			return decToBin(decNum /2) + decNum % 2;
		}
	}
	// Question 1 decimal to binary not use recursive
	public static String decToBinary(int decNum) {
		String result = "";
		while (decNum > 0) {
			result = decNum % 2 + result; 
			decNum /= 2;
		}
		return result;
	}
	// Question 1 binary to decimal use recursive
	public static int binToDec(String binNum) {
		if (binNum.length() == 1) {
			return Integer.parseInt(binNum);
		}else {
			int firstDigit = Integer.parseInt(binNum.substring(0, 1));
			String restString = binNum.substring(1);
			return (int) (firstDigit * Math.pow(2, binNum.length() -1) + binToDec(restString));
		}
	}
	// Question 1 binary to decimal not use recursive
	public static int binaryToDecimal(String binNum) {
		int result = 0;
		while (binNum.length() > 0) {
			int firstDigit = Integer.parseInt(binNum.substring(0, 1));
			result += firstDigit * Math.pow(2, binNum.length() -1);
			binNum = binNum.substring(1);
		}
		return result;
	}
	// Question 2 use recursive
	static int digitSum = 0;
	public static boolean isDivisible(String number) {
		if (number.length() == 1) {
			digitSum += Integer.parseInt(number);
		}else {
			int first = Integer.parseInt(number.substring(0, 1));
			digitSum += first;
			String rest = number.substring(1);
			isDivisible(rest);		
		}
		return digitSum % 3 == 0 && digitSum % 9 == 0;
	}
	// Question 2 not use recursive
	public static boolean isDivisible2(String number) {
		int digitSum = 0;
		for (int i = 0; i < number.length(); i++) {
			digitSum += Integer.parseInt(number.substring(i, i + 1));
		}
		return digitSum % 3 == 0 && digitSum % 9 == 0;
	}
	// Question 3 use recursive
	public static boolean canDivide(String number) {
		int digitSum = 0;
		for (int i = 0; i < number.length(); i++) {
			digitSum += Integer.parseInt(number.substring(i, i + 1));
		}
		return digitSum % 3 == 0 && digitSum % 9 != 0;
	}
	// Question 3 not use recursive
	public static boolean canDivide2(String number) {
		int digitSum = 0;
		for (int i = 0; i < number.length(); i++) {
			digitSum += Integer.parseInt(number.substring(i, i + 1));
		}
		return digitSum % 3 == 0 && digitSum % 9 != 0;
	}
	// Question 4
	public static int countNumDigit(int number) {
		if (number < 1) {
			return 0;
		}else {
			return 1 + countNumDigit(number / 10);
		}
	}
	// Question 5
	public static int total(String number) {
		if (number.length() == 1) {
			return Integer.parseInt(number);
		}else {
			int first = Integer.parseInt(number.substring(0, 1));
			String rest = number.substring(1);
			return first += total(rest);
		}
	}
	// Question 6
	public static int multiply(String number) {
		if (number.length() == 1) {
			return Integer.parseInt(number);
		}else {
			int first = Integer.parseInt(number.substring(0, 1));
			String rest = number.substring(1);
			return first *= multiply(rest);
		}
	}
	// Question 7
	public static int countOddDigits(int n) {
		if (n < 10) {
			return n % 2 == 0 ? 0 : 1;
		}else {
			int lastDigit = n % 10;
			return (lastDigit % 2 == 0 ? 0 : 1) + countOddDigits(n / 10);
		}
	}
	// Question 8
	public static int totalEvenDigits(int n) {
		if (n < 10) {
			return n % 2 == 0 ? n : 0;
		}else {
			int lastDigit = n % 10;
			return (lastDigit % 2 == 0 ? lastDigit : 0) + totalEvenDigits(n / 10);
		}
	}
	// Question 9
	public static int multiplyOddDigits(int n) {
		if (n < 10) {
			return n % 2 == 0 ? 1 : n;
		}else {
			int lastDigit = n % 10;
			return (lastDigit % 2 == 0 ? 1 : lastDigit) * multiplyOddDigits(n / 10);
		}
	}
	// Question 10
    public static int reverse(int n, int rev) {
        if(n == 0) {
            return rev;
        } else {
            return reverse(n / 10, rev * 10 + n % 10);
        }
    }
	public static void main(String[] args) {
		int decNum = 10;
		int number = 12345;
		// Test question 1
		System.out.println("to binary: " + (decToBin(decNum)));
		System.out.println("to binary: " + decToBinary(decNum));
		System.out.println("to decimal: " + binToDec("1010"));
		System.out.println("to decimal: " + binaryToDecimal("1010"));
		// Test question 2
		System.out.println("Chia het cho ca 3 va 9: " + isDivisible("18")); 
		System.out.println("Chia het cho ca 3 va 9: " + isDivisible2("18"));
		// Test question 3
		System.out.println("Chi chia het cho 3: " + canDivide("18"));
		System.out.println("Chi chia het cho 3: " + canDivide2("18"));
		// Test question 4
		System.out.println("So chu so cua " + number + " la: " + countNumDigit(number));
		// Test question 5
		System.out.println("Tong cac chu so nguyen duong: " + total("123"));
		// Test question 6
		System.out.println("Tich cac chu so nguyen duong: " + multiply("1234"));
		// Test question 7
	    System.out.println("So luong chu so le trong " + number + " la: " + countOddDigits(number));
	    // Test question 8
	    System.out.println("Tong cac chu so chang trong " + number + " la: " + totalEvenDigits(number));
	    // Test question 9
	    System.out.println("Tich cac chu so le trong " + number + " la: " + multiplyOddDigits(number));
	    // Test question 10
	    System.out.println("Chu so đao nguoc cua " + number + " la: " + reverse(number, 0));
	}
}
