package overloading;

public class product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice(int quantity) {
		return price*quantity;
	}
	
	public double getPrice(int quantity,int quantity1) {
		return price*(quantity+quantity1);
	}
	
}
