package supermarket.products;

public class DairyProduct extends GroceryProduct{
	public DairyProduct(String name, double price, double discount, Fat fat) {
		super(name, price, discount);
		this.fat = fat;
		// TODO Auto-generated constructor stub
	}

	private Fat fat;
	
	@Override
	public String display() {
		return(super.display() + "\nFat Level: " + fat);
	}

	public Fat getFat() {
		return fat;
	}

	public void setFat(Fat fat) {
		this.fat = fat;
	}
	
}
