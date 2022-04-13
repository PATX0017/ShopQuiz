/*Justin Palso
 * Inheritance Quiz
 * 11 March 2022
 */

//Class will inherit from Product class
public class Book extends Product {
//Private attributes for this class
	private String author;
	private String genre;
	private String isbn;

	// Made the constructor Public. Everyone will see this. This constructor is
	// everything the Parent supplies
	public Book(String name, double price, int quantity, String author) {
		// Super is Product (Parents) attributes.
		super(name, price, quantity);
		// TODO Auto-generated constructor stub
	}

	// Made the constructor Public. Everyone will see this. This constructor will
	// include everything.
	public Book(String name, double price, int quantity, String author, String genre, String isbn) {
		super(name, price, quantity);
		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", isbn=" + isbn + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void getDetails() {
		System.out.println("We sell books on Software Development.");

	}

}
