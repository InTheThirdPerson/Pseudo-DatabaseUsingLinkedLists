package pseudoDatabase;

import javax.swing.*;

public class SecondTableLink {
	
	// Information stored in each link on the list.
	public String customerID;
	public String modelNumber;
	public int quantityOrdered;
	public double total;
	
	public String outputString;
	
	public SecondTableLink next;																			// Next link in list.
	
// -------------------------------------------------------------
	
	public SecondTableLink(String customerID, String modelNumber, int quantityOrdered, double total) {		// Constructor.
	
		this.customerID = customerID;
		this.modelNumber = modelNumber;
		this.quantityOrdered = quantityOrdered;
		this.total = total;
		
	} // End of SecondTableLink() method.
	
// -------------------------------------------------------------
	
	public void displayLink() {																				// Display ourself.
	
		// Used to display the data when called from the find(), display() or displayList() methods.
		
		outputString = "{ Customer ID#: " + customerID + "\n" +
						"Model Number: " + modelNumber + "\n" +
						"Quantity Ordered: " + quantityOrdered + "\n" +
						"Total Cost: $" + total + " } \n";

		JOptionPane.showMessageDialog(null, outputString, "Found Item", JOptionPane.INFORMATION_MESSAGE);
		
	} // End of displayLink() method.
	
// -------------------------------------------------------------
	
} // End of SecondTableLink class.