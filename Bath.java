/*Justin Palso
 * Inheritance Quiz
 * 11 March 2022
 */

//Class was made of Bath and extends
public class Bath extends Product {
	// The attributes were called from the parent class "Product" and listed. There
	// was no private attributes added so it only holds those parent values.
	public Bath(String name, double price, int quantity) {
		// Super is Product (Parents) attributes.
		super(name, price, quantity);

	}

	@Override
	public String toString() {
		return "Bath [toString()=" + super.toString() + "]";
	}

	// Returns the getDetails for the shop class.
	@Override
	public void getDetails() {
		System.out.println("We sell organic bath products!");

	}

}
