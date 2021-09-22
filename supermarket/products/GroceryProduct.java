package supermarket.products;

import java.util.ArrayList;

public class GroceryProduct {
	public GroceryProduct(String name, double price, double discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	private String name;
	private double price;
	private double discount;
	
	public double getActualPrice() {
		return price - (price * discount / 100);
	}

	public String display() {
		return (
				"Name: " + name + "\n" +
				"Price: " + price + "\n" +
				"Discount: " + discount  + "%"
				);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public static void main(String[] args) {
		ArrayList <GroceryProduct> cart = new ArrayList<>();
		GroceryProduct toast = new GroceryProduct("Toast", 2.5, 10);
		cart.add(toast);
		
		System.out.println(toast.display());
		System.out.println(toast.getActualPrice());
		
		
		Beverage coke = new Beverage("Coke",5,0,SugarLevel.ZERO);
		cart.add(coke);
		System.out.println(coke.display());
		
		DairyProduct milk = new DairyProduct("Milk", 20, 5, Fat.FULLCREAM);
		cart.add(milk);
		System.out.println(milk.display());
		
		double total = 0;
		
		for(int i = 0; i < cart.size(); i++) {
			total += cart.get(i).getActualPrice();
		}
		
		System.out.println("The total cost " + total);
	}
}
