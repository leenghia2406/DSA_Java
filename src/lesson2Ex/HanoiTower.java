package lesson2Ex;

public class HanoiTower {
	public static void solveHanoiTower(int n, char start, char end, char mid) {
		if(n == 1) {
			System.out.println("Di chuyển đĩa 1 từ cọc " + start + " đến cọc "+
		end);
			return;
		}else {
			solveHanoiTower(n -1, start, mid, end);
			System.out.println("Di chuyển đĩa " + n + " từ cọc "+ start +" đến cọc "+ 
			end);
			solveHanoiTower(n -1, mid, end, start);
		}
	}
	public static void main(String[] args) {
		int n = 3;
		char start = 'A';
		char mid = 'B';
		char end = 'C';
		solveHanoiTower(n, start, end, mid);
	}
}
