package pseudoDatabase;

public class FirstTableLinkList {
	
	private static FirstTableLink first;														// Reference to the first link on the list.
	
// -------------------------------------------------------------
	
	public FirstTableLinkList() {first = null;}													// Constructor (No items in the list, yet).

// -------------------------------------------------------------
	
	public boolean isEmpty() {return (first==null);}											// Returns true if the list is empty.
	
// -------------------------------------------------------------
	
	// Makes a new link inserted at the start of the list.
	public void insertFirst(String modelNumber, String description, double cost, double price, int quantityOnHand) {
		FirstTableLink newLink = new FirstTableLink(modelNumber, description, cost, price, quantityOnHand);
		newLink.next = first;																	// The new link becomes the old first link.
		first = newLink;																		// The new first becomes newLink.
	} // End of insertFirst() method.
	
// -------------------------------------------------------------
	
	public FirstTableLink deleteFirst() {														// Deletes first link (assumes list not empty).
		FirstTableLink temp = first;															// Save reference to the link.
		first = first.next;																		// Delete the link: New first is the next item in list.
		return temp;																			// Return the deleted link.
	} // End of deleteFirst() method.
	
// -------------------------------------------------------------
	
	public void displayList() {																	// Display the entire 'table'.
		System.out.print("List (first-->last): ");
		FirstTableLink current = first;															// Start at the beginning of the list,
		while(current != null) {																// search until end of the list.
			current.displayLink();																// Display and move to next link.
			current = current.next;
		}
		System.out.println("");
	} // End of dislayList() method.
	
// -------------------------------------------------------------
	
	public static void display(String value) {													// Display all parts with the passed modelNumber.
		FirstTableLink current = first;															// Start at the beginning of the list,
		while(current != null) {																// search until end of the list.
			if(current.modelNumber.equals(value)) {												// If found, display and move to next link.
				current.displayLink();
				current = current.next;
			} else {current = current.next;}													// Otherwise, move to next link.
		}
		System.out.println("");
	} // End of display() method.
	
// -------------------------------------------------------------
	
	public void find(String value) {															// Find a part with the passed modelNumber.
		FirstTableLink current = first;															// Start at the beginning of the list,
		while(current != null) {																// search until end of the list.
			if(current.modelNumber.equals(value)) {												// If found, display and break out of loop.
				System.out.println("Found: " + value);
				break;
			} else {current = current.next;}													// Otherwise, move to next link.
		}
		System.out.println("");
	} // End of find() method.
	
// -------------------------------------------------------------
	
} // End of FirstTableLinkList class.