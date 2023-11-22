package arrayListExercise;

import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Award {
	private ArrayList<Customer> list = new ArrayList<>();
	public Award(String url) {
		this.list = loadCustomerList(url);
	}
	private ArrayList<Customer> loadCustomerList(String url){
		ArrayList<Customer> result = new ArrayList<Customer>();
		ArrayList<String> lines = FileUtile.readFile(url);
//		Lay tung dong bien thanh customer bo vao danh sach tra ve
		for (String line : lines) {
//			Bien 1 dong thanh 1 chuoi cac token loại
			StringTokenizer tokens = new StringTokenizer(line, "\t");
			String fullName = "";
			int score = 0;
			String idSuperMarket = "";
			int colNum = 1;
			while (tokens.hasMoreElements()) {
				switch(colNum) {
				case 1:
					fullName = tokens.nextToken();
					break;
				case 2:
					score = Integer.parseInt(tokens.nextToken());
					break;
				case 3:
					idSuperMarket = tokens.nextToken();
					break;
				}
				colNum++;
			}
			Customer cus = new Customer(fullName, score, idSuperMarket);
			result.add(cus);
		}
		return result;
	}
//	Question 1
	public Customer getHighestScoreCustomer(){
		if (list.isEmpty()) {
			throw new RuntimeException("LIST IS EMPTY");
		}
		Customer highestScoreCustomer = list.get(0);
	    for (Customer cus : list) {
	        if (cus.getScore() > highestScoreCustomer.getScore()) {
	            highestScoreCustomer = cus;
	        }
	    }
	    return highestScoreCustomer;
	}
//	Question 2 
	private int randomInt() {
		return new Random().nextInt(list.size());
	}
	public ArrayList<Customer> getRandomLuckyCustomers(int numCus){
		ArrayList<Customer> result = new ArrayList<Customer>();
		if (numCus < list.size()) {
			while (numCus >= 1) {
				int ranNum = randomInt();
				Customer temp = list.get(ranNum);
				if (!result.contains(result)) {
					result.add(temp);
					numCus--;
				}
			}
		}else {
			throw new RuntimeException("OverSizeOfList");
		}
		return result;
	}
//	Question 3
	public ArrayList<Customer> getListParticipateCus(){
		ArrayList<Customer> result = new ArrayList<Customer>();
		ArrayList<String> addedName = new ArrayList<String>();
	    for (Customer cus : list) {
	        String name = cus.getFullName();
	        if (!addedName.contains(name)) {
	            addedName.add(name);
	            result.add(cus);
	        }
	    }
		return result;
	}
//	Question 4
	public void printEndOfYearAwards() {
	    System.out.println("SPECIAL PRIZES:");
	    System.out.println(printListCustomers(getRandomLuckyCustomers(3)));
	    System.out.println("FIRST PRIZES:");
	    System.out.println(printListCustomers(getRandomLuckyCustomers(5)));
	    System.out.println("SECOND PRIZES:");
	    System.out.println(printListCustomers(getRandomLuckyCustomers(10)));
	    System.out.println("THIRD PRIZES:");
	    System.out.println(printListCustomers(getRandomLuckyCustomers(20)));
	}
	public String printListCustomers(ArrayList<Customer> customers) {
	    String result = "";
	    for (Customer c : customers) {
	        result += c.toString() + "\n";
	    }
	    return result;
	}
	public static void main(String[] args) {
		Award award = new Award("./src/arrayListExercise/Danhsach.txt");
		System.out.println("RANDOM LUCKY CUSTOMERS: \n" +
		award.printListCustomers(award.getRandomLuckyCustomers(3)));
		System.out.println("MAX SCORE CUSTOMER: \n" +
		award.getHighestScoreCustomer());
		System.out.println("LIST PARTICIPATE CUSTOMERS: \n" + 
		award.printListCustomers(award.getListParticipateCus()));
		System.out.println("END OF YEAR AWARDS: ");
		award.printEndOfYearAwards();
		
	}
}
