/*Justin Palso
 * 03-11-22
 * Quiz 5: Inheritance
 * 
 */
public abstract class Product {
	// Attributes
	protected String name;
	protected double price;
	protected int quantity;

//Constructors.
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

//Settlers and getters.
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//Instance Methods

//buy method to subtract the quantity.
	boolean buy() {
	
		if (quantity > 0) {
			quantity--;
			return true;

		} else {
			return false;
		}
	}

//Get Details method to send to sub classes. Will not return any attributes or anything.
	abstract void getDetails();

}
