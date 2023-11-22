package lesson2Ex;

public class RecursivePart2 {
	public static void HanoiTower(int n, char start, char end, char mid) {
		if(n == 1) {
			System.out.println("Di chuyển đĩa 1 từ cọc " + start + " đến cọc "+
		end);
			return;
		}else {
			HanoiTower(n -1, start, mid, end);
			System.out.println("Di chuyển đĩa " + n + " từ cọc "+ start +" đến cọc "+ 
			end);
			HanoiTower(n -1, mid, end, start);
		}
	}
	public static int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n -2);
		}
	}
    public static int UCLN(int a, int b) {
    	if(b == 0) {
    		return a;
    	}else {
			return UCLN(b, a % b);
		}
    }
    public static int countDigitOfNum(int n) {
    	if (n < 1) {
			return 0;
		}else {
			return 1 + countDigitOfNum(n / 10);
		}
    }
    public static int[][] createPascalTriangle(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; 
            triangle[i][i] = 1; 
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }
    public static void printPascalTriangle(int[][] triangle) {
    	for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
    }
    public static double Sn(int n) {
    	if(n == 0) {
    		return 1.0;
    	}else {
			 return 1/(Math.pow(2, n) * factorial(n)) + Sn(n -1);
		}
    }
    public static double starSn(int n) {
    	if (n == 0) {
			return 1.0;
		}else {
			double mauSo = 1;
			for (int i = 1; i <= n; i++) {
				mauSo *= 2 * i; 
			}
			return 1/(mauSo) + starSn(n - 1);
		}
    }
    public static int factorial(int n) {
    	if(n < 2) {
    		return 1;
    	}else {
			return n * factorial(n -1);
		}
    }
	public static void main(String[] args) {
		// Test HanoiTower
		int n = 3;
		char start = 'A';
		char mid = 'B';
		char end = 'C';
		HanoiTower(n, start, end, mid);
		// Test_Fibonacci
		int num = 7;
		System.out.println("Fibonacci: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        // Test UCLN
        int a = 15;
        int b = 18;
        System.out.println("UCLN cua " + a + " va " + b + " la: " +UCLN(a, b));
        // Test count number digit
        System.out.println("So chu so la: " + countDigitOfNum(2406));
        // Test pascal_triangle
        System.out.println("Tam giac pascal: ");
        int[][] pascalTriangle = createPascalTriangle(num);
        printPascalTriangle(pascalTriangle);
        // Test series number
        System.out.println("Tong chuoi so khi dung ham Sn: " + Sn(3));
        System.out.println("Tong chuoi so khi dung ham starSn: " + starSn(3));
	}
}
