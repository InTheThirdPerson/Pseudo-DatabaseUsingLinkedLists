package pseudoDatabase;

public class SecondTableLink {
	
	// Information stored in each link on the list.
	public String customerID;
	public String modelNumber;
	public int quantityOrdered;
	public double total;
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
		System.out.print("{ Customer ID#: ");
		System.out.print(customerID);
		System.out.print(", Model number: ");
		System.out.print(modelNumber);
		System.out.print(", Quantity Ordered: ");
		System.out.print(quantityOrdered);
		System.out.print(", Total Cost: $");
		System.out.print(total);
		System.out.print("}");
		System.out.println("");
		
	} // End of displayLink() method.
	
// -------------------------------------------------------------
	
} // End of SecondTableLink class.