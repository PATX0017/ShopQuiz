/*Justin Palso
 * Inheritance Quiz
 * 11 March 2022
 */

//Class will inherit from Product class
public class Apparel extends Product {
	// Private attributes for this class
	private char size;
	private String color;

	// Made the constructor Public. Everyone will see this. This constructor is
	// mixed of both Apparel and Products attributes
	public Apparel(String name, double price, int quantity, char size, String color) {
		// Super is Product (Parents) attributes.
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apparel [size=" + size + ", color=" + color + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void getDetails() {
		System.out.println("We sell diferent kinds of business clothes for both men and women");
	}

}
