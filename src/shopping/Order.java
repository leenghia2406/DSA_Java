package shopping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Order {
	private String customerName;
	private TreeSet<OrderItem> pack = new TreeSet<OrderItem>();
	public Order(String customerName) {
		super();
		this.customerName = customerName;
	}
	public void addOrderItem(OrderItem oI) {
		pack.add(oI);
	}
	public void removeOrderItem(OrderItem oI) {
		pack.remove(oI);
	}
	public OrderItem findInfoItem(String itemName) {
		OrderItem result = pack.first();
		for (OrderItem orderItem : pack) {
			if (orderItem.getNameItem().equals(itemName)) {
				result = orderItem;
			}
		}
		return result;
	}
	public TreeSet<OrderItem> getItemsByCharacter(char c){
		TreeSet<OrderItem> result = new TreeSet<OrderItem>();
		for (OrderItem orderItem : pack) {
			if (orderItem.getFirstChar() == c) {
				result.add(orderItem);
			}
		}
		return result;
	}
	public TreeSet<OrderItem> getItemsGreaterThanNumber(int number){
		TreeSet<OrderItem> result = new TreeSet<OrderItem>();
		for (OrderItem orderItem : pack) {
			if (orderItem.getQuantity() > number) {
				result.add(orderItem);
			}
		}
		return result;
	}	
	public void addSpecial(OrderItem oI) {
		for (OrderItem orderItem : pack) {
			if (orderItem.getNameItem().equals(oI.getNameItem())) {
				orderItem.setQuantity(orderItem.getQuantity() + oI.getQuantity());
			}
		}
	}
	public void removeSpecial(OrderItem oI) {
		Iterator<OrderItem> iterOderItem = pack.iterator();
		while (iterOderItem.hasNext()) {
			OrderItem orderItem = iterOderItem.next();
				if (orderItem.getId() == oI.getId() && orderItem.getUnitPrice() == oI.getUnitPrice()
						&& orderItem.getNameItem().equals(oI.getNameItem())) {
					if (orderItem.getQuantity() == oI.getQuantity()) {
						iterOderItem.remove();
					}
					if (orderItem.getQuantity() > oI.getQuantity()) {
						orderItem.setQuantity(orderItem.getQuantity() - oI.getQuantity());
					}
					if (orderItem.getQuantity() < oI.getQuantity()) {
						throw new IllegalArgumentException("Invalid quantity to remove. Quantity in cart is less than requested.");
					}
				}
		}

	}
	public double totalQuantityOfPack() {
		double result = 0;
		for (OrderItem orderItem : pack) {
			double itemQuantity = orderItem.getUnitPrice() * orderItem.getQuantity();
			result += itemQuantity;
		}
		return result;
	}
	public void printBill() {
	    System.out.println("Bill Details:");
	    for (OrderItem orderItem : pack) {
	        System.out.println("Item: " + orderItem.getNameItem());
	        System.out.println("Quantity: " + orderItem.getQuantity());
	        System.out.println("Unit Price: " + orderItem.getUnitPrice());
	        double totalItemPrice = orderItem.getQuantity() * orderItem.getUnitPrice();
	        System.out.println("Total Price for this Item: " + totalItemPrice);
	        System.out.println("-----------------------------");
	    }
	    System.out.println("Total Bill Amount: " + totalQuantityOfPack());
	}
	@Override
	public String toString() {
		return "CustomerName: " + customerName + ", Pack: " + pack;
	}
	public static void main(String[] args) {
		Order cust1 = new Order("Kamen Rider Knight");
		OrderItem oI1 = new OrderItem("111", "Mi Gau Do", 5000, 5);
		OrderItem oI6 = new OrderItem("116", "Mi Gau Do", 5000, 5);
		OrderItem oI5 = new OrderItem("115", "Mi Tieu Nhi", 5000, 5);
		OrderItem oI2 = new OrderItem("112", "Kem Danh Rang PS", 35000, 2);
		OrderItem oI3 = new OrderItem("113", "Banh Chocopie", 15000, 4);
		OrderItem oI4 = new OrderItem("114", "Number 1", 11000, 2);
		cust1.addOrderItem(oI2);
		cust1.addOrderItem(oI1);
		cust1.addOrderItem(oI5);
		cust1.addOrderItem(oI4);
		cust1.addOrderItem(oI3);
		cust1.removeOrderItem(oI3);
		cust1.addSpecial(oI6);
		System.out.println(cust1);
		System.out.println(cust1.getItemsByCharacter('M'));
		System.out.println(cust1.getItemsGreaterThanNumber(4));
		System.out.println(cust1.findInfoItem("Mi Gau Do"));
		System.out.println(cust1.totalQuantityOfPack());
		cust1.printBill();
//		cust1.removeSpecial(oI1);
//		cust1.removeSpecial(oI2);
//		cust1.removeSpecial(oI3);
//		cust1.removeSpecial(oI4);
//		System.out.println(cust1);
		
	}
	
}
