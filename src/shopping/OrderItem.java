package shopping;

public class OrderItem implements Comparable<OrderItem> {
	private String id;
	private String nameItem;
	private int unitPrice;
	private int quantity;
	public OrderItem(String id, String nameItem, int unitPrice, int quantity) {
		super();
		this.id = id;
		this.nameItem = nameItem;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Id: " + id + ", NameItem: " + nameItem + ", UnitPrice: " + unitPrice + ", Quantity: " + quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNameItem() {
		return nameItem;
	}
	public char getFirstChar() {
		return nameItem.charAt(0);
	}
	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public int compareTo(OrderItem o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
//		int result = this.getNameItem().compareTo(o.getNameItem());
//		if (result == 0) {
//			setQuantity(quantity + o.quantity);
//		}
//		return result;
	}
	
}
