package pseudoDatabase;

import javax.swing.*;

public class FirstTableLink {
	
	// Information stored in each link on the list.
	public String modelNumber;
	public String description;
	public double cost;
	public double price;
	public int quantityOnHand;
	
	public String outputString;
	
	public FirstTableLink next; 																					// Next link in list.
	
// -------------------------------------------------------------
	
	public FirstTableLink(String modelNumber, String description, double cost, double price, int quantityOnHand) {	// Constructor.
	
		// Sets the variables of the objects in the table to the passed parameters.
		this.modelNumber = modelNumber;
		this.description = description;
		this.cost = cost;
		this.price = price;
		this.quantityOnHand = quantityOnHand;
		
	} // End of FirstTableLink() method.
	
// -------------------------------------------------------------
	
	public void displayLink() {																						// Display ourself.
	
		// Used to display the data when called from the find(), display() or displayList() methods.
		outputString = "{ Model Number: " + modelNumber + "\n" +
						"Description: " + description + "\n" +
						"Cost: $" + cost + "\n" +
						"Price: $" + price + "\n" +
						"Quantity On Hand: " + quantityOnHand + "} \n";

		JOptionPane.showMessageDialog(null, outputString, "Found Item", JOptionPane.INFORMATION_MESSAGE);
		
	} // End of displayLink() method.
	
// -------------------------------------------------------------
	
} // End of FirstTableLink class.