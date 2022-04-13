/*Justin Palso
 * 03-11-22
 * Quiz 5: Inheritance
 * 
 */

import java.util.Scanner;

public class Shop {
//Attributes
	static double totalAmount = 0;
	// This is starting the Array.
	static Product[] inventory = {
			// These are the attributes of the array.
			new Apparel(" Business Ritual Women’s Long Sleeve Top", 65.39, 4, 'L', "Blue"),
			new Book("The Art of Computer Programming", 190.54, 9, "Donald E. Knuth"),
			new Apparel("Men’s Business Casual Shirt", 57.10, 2, 'M', "Teal"),
			new Bath("Organic Turmeric Soap ", 11.25, 1),
			new Book("Head First Design Pattern", 37.35, 3, "Eric Freeman") };

//This is the creation of the display Menu method
	static void displayMenu() {
		System.out.println(
				"Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
//This is printing each of the index.
		for (int i = 0; i <= inventory.length - 1; i++) {
			System.out.println(i + " :" + inventory[i].getName());

		}

	}

//Main method
	public static void main(String[] agrs) {
		// Scanner for input from user.
		Scanner user = new Scanner(System.in);
		// Int being described as userinput.
		int userInput;
		// The start of DO while statement
		do {
//Calling displayMenu from before
			displayMenu();
			// userinput being called as the scanner.
			userInput = user.nextInt();
			// user shows that the int can not be less than or equal 0 or greater than or
			// equal to 4.
			if (userInput >= 0 && userInput <= 4) {
				// takes user input and shows the get price value and calls the get price value
				// from product class.
				if (inventory[userInput].buy()) {
					// takes the get price and applies it to the string totalAmount.{
					totalAmount = totalAmount + inventory[userInput].getPrice();
					// If the inventory was in stock. It would return the get price value, as well
					// as confirming the purchase was successful.
					System.out.println("Your purchase was successful " + totalAmount);
				}

				else {
					// If the item was out of stock then it would return this statement below
					// message. Notifying the user that they did not get the item.
					System.out.println("Sorry! This product is out of stock.");

				}
			}

		} while (userInput >= 0 && userInput <= 4);
		{
			System.out.println("Thank you for shopping with us! The total amount is : " + totalAmount);
		}
		user.close();
	}

}
