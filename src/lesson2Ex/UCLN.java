package lesson2Ex;

public class UCLN {
    public static int findGCD(int a, int b) {
    	if(b == 0) {
    		return a;
    	}else {
			return findGCD(b, a % b);
		}
    }
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("UCLN cua " + a + " va " + b + " la " +findGCD(a, b));
	}
}
