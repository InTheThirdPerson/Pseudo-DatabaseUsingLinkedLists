package pseudoDatabase;

public class FirstTableLink {
	
	// Information stored in each link on the list.
	public String modelNumber;
	public String description;
	public double cost;
	public double price;
	public int quantityOnHand;
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
		System.out.print("{ Model Number: ");
		System.out.print(modelNumber);
		System.out.print(", Description: ");
		System.out.print(description);
		System.out.print(", Cost: $");
		System.out.print(cost);
		System.out.print(", Price: $");
		System.out.print(price);
		System.out.print(", Quantity On Hand: ");
		System.out.print(quantityOnHand);
		System.out.print("}");
		System.out.println("");
		
	} // End of displayLink() method.
	
// -------------------------------------------------------------
	
} // End of FirstTableLink class.