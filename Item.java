package week8;

public class Item {

	String name;
	double unitPrice;
	double quantity;
	double total;
	
	
	
	public Item(String name, double unitPrice, double quantity) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}



	public String toString() {
		return "Item [name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", total=" + total + "]";
	}



	public void calCost() {
		
		total = unitPrice*quantity;
		System.out.println("You bought " + quantity + " of this " + name + ", Each " + name + " is " + unitPrice + " and Total price is $" + total);
		
	}
	
}
