package supermarket.products;

public class Beverage extends GroceryProduct{
	public Beverage(String name, double price, double discount, SugarLevel sugarLevel) {
		super(name, price, discount);
		this.sugarLevel = sugarLevel;
	}

	public SugarLevel getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(SugarLevel sugarLevel) {
		this.sugarLevel = sugarLevel;
	}

	private SugarLevel sugarLevel;
	
	@Override
	public String display() {
		return(super.display() + "\nSugarLevel: " + sugarLevel);
	}
}
