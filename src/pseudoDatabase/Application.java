package pseudoDatabase;

/* Project: Pseudo-Database Using Linked Lists
 * Author: Thomas Freeman
 * Created: May 13, 2014 10:28pm CST
 * Version History:
 * May 13, 2014 v1.0 - Initial push.
 * May 15, 2014 v1.02 - Made changes to comments to improve readability.
 * 						Added deleteFirst() method for later implementation.
 */

import java.io.*;

public class Application {

	public static void main(String[] args) throws IOException {
		
		String value;
		
		FirstTableLinkList firstTable = new FirstTableLinkList();
		SecondTableLinkList secondTable = new SecondTableLinkList();
		
		// Example row inserts for table structure.
		firstTable.insertFirst("abc123","Mother Board 4 bit",49.99,59.99,5);
		firstTable.insertFirst("def123","Mother Board 8 bit",59.99,69.99,4);
		firstTable.insertFirst("ghi123","Mother Board 16 bit",69.99,79.99,6);
		firstTable.insertFirst("jkl123","Mother Board 32 bit",79.99,89.99,4);
		firstTable.insertFirst("mno123","Mother Board 64 bit",89.99,99.99,2);
		firstTable.insertFirst("pqr123","Mother Board 128 bit",99.99,109.99,4);
		firstTable.insertFirst("stu123","Mother Board 256 bit",109.99,119.99,6);
		firstTable.insertFirst("vwx123","Mother Board 512 bit",119.99,129.99,7);
		firstTable.insertFirst("abc456","i10 CPU 4 bit",79.99,89.99,5);
		firstTable.insertFirst("def456","i10 CPU 8 bit",89.99,99.99,4);
		firstTable.insertFirst("ghi456","i10 CPU 16 bit",99.99,109.99,6);
		firstTable.insertFirst("jkl456","i10 CPU 32 bit",109.99,119.99,4);
		firstTable.insertFirst("mno456","i10 CPU 64 bit",119.99,129.99,2);
		firstTable.insertFirst("pqr456","i10 CPU 128 bit",129.99,139.99,4);
		firstTable.insertFirst("stu456","i10 CPU 256 bit",139.99,149.99,6);
		firstTable.insertFirst("vwx456","i10 CPU 512 bit",149.99,159.99,7);
		firstTable.insertFirst("abc789","DDR20 RAM 4GB",139.99,149.99,3);
		firstTable.insertFirst("def789","DDR20 RAM 8GB",149.99,159.99,4);
		firstTable.insertFirst("ghi789","DDR20 RAM 16GB",159.99,169.99,5);
		firstTable.insertFirst("jkl789","DDR20 RAM 32GB",169.99,179.99,2);
		firstTable.insertFirst("mno789","DDR20 RAM 64GB",179.99,189.99,6);
		firstTable.insertFirst("pqr789","DDR20 RAM 128GB",189.99,199.99,5);
		firstTable.insertFirst("stu789","DDR20 RAM 256GB",199.99,209.99,4);
		firstTable.insertFirst("vwx789","DDR20 RAM 512GB",209.99,219.99,7);
		firstTable.insertFirst("abc000","Real 3D Video 4 bit",139.99,149.99,4);
		firstTable.insertFirst("def000","Real 3D Video 8 bit",149.99,159.99,6);
		firstTable.insertFirst("ghi000","Real 3D Video 16 bit",159.99,169.99,7);
		firstTable.insertFirst("jkl000","Real 3D Video 32 bit",169.99,179.99,3);
		firstTable.insertFirst("mno000","Real 3D Video 64 bit",179.99,189.99,4);
		firstTable.insertFirst("pqr000","Real 3D Video 128 bit",189.99,199.99,5);
		firstTable.insertFirst("stu000","Real 3D Video 256 bit",199.99,209.99,2);
		firstTable.insertFirst("vwx000","Real 3D Video 512 bit",209.99,219.99,6);
		
		// Example row inserts for table structure.
		secondTable.insertFirst("SCC","vwx123",2,259.98);
		secondTable.insertFirst("MCW","stu123",3,359.97);
		secondTable.insertFirst("MATC","jkl123",4,359.96);
		secondTable.insertFirst("Boeing","mno123",1,99.99);
		secondTable.insertFirst("Master Card","vwx123",5,649.95);
		secondTable.insertFirst("BestBuy","def123",6,419.94);
		secondTable.insertFirst("ATT","stu123",3,359.97);
		secondTable.insertFirst("TigerDirect","mno123",2,199.98);
		secondTable.insertFirst("SCC","vwx456",7,1119.93);
		secondTable.insertFirst("MCW","stu456",1,149.99);
		secondTable.insertFirst("MATC","jkl456",3,359.97);
		secondTable.insertFirst("Boeing","mno456",8,1039.92);
		secondTable.insertFirst("Master Card","vwx456",5,799.95);
		secondTable.insertFirst("BestBuy","def456",3,299.97);
		secondTable.insertFirst("ATT","stu456",2,299.98);
		secondTable.insertFirst("TigerDirect","jkl456",4,479.96);
		secondTable.insertFirst("SCC","vwx789",7,1539.93);
		secondTable.insertFirst("MCW","stu789",4,839.96);
		secondTable.insertFirst("MATC","jkl789",3,539.97);
		secondTable.insertFirst("Boeing","mno789",5,949.95);
		secondTable.insertFirst("Master Card","vwx789",6,1319.94);
		secondTable.insertFirst("BestBuy","def789",5,799.95);
		secondTable.insertFirst("ATT","stu789",3,629.97);
		secondTable.insertFirst("TigerDirect","jkl789",4,719.96);
		secondTable.insertFirst("SCC","vwx000",1,219.99);
		secondTable.insertFirst("MCW","stu000",2,419.98);
		secondTable.insertFirst("MATC","jkl000",5,899.95);
		secondTable.insertFirst("Boeing","mno000",6,1139.94);
		secondTable.insertFirst("Master Card","vwx000",3,659.97);
		secondTable.insertFirst("BestBuy","def000",2,319.98);
		secondTable.insertFirst("ATT","stu000",1,209.99);
		secondTable.insertFirst("TigerDirect","jkl000",3,539.97);
		
		while(true) {																		// Creates user interface.
			
		System.out.print("Enter first letter of display or find: ");
		int choice = getChar();
		
		switch(choice) {
		
		case 'd':																			// User selected 'd' to display all parts by a model number.
		System.out.print("Enter the model number to display: ");
		value = getString();																// Determines what the user input is.
		System.out.print("Querying first table: ");
		FirstTableLinkList.display(value);													// Tries to locate the part on the first table.
		System.out.print("Querying second table: ");
		SecondTableLinkList.display(value);													// Tries to locate the part on the second table.
		break;
		
		case 'f':																			// User selected 'f' to find a part.
		System.out.print("Query first or second table?");
		int pickTable = getChar();															// Determines what the user input is.															
			switch(pickTable) {
				case 'f':																	// User selected the first table to 'query'.
					System.out.print("Enter the model number to find: ");
					value = getString();													// Determines what the user input is.
					System.out.print("Querying first table: ");
					firstTable.find(value);													// Tries to locate the part(s) on the first table.
					break;
				case 's':																	// User selected the second table to 'query'.
					System.out.print("Enter the model number to find: ");
					value = getString();													// Determines what the user input is.
					System.out.print("Querying second table: ");
					secondTable.find(value);												// Tries to locate the part(s) on the second table.
					break;	
				
				default:
					System.out.print("Invalid entry. Please enter only the first letter of 'first' or 'second' in lowercase. \n");
			} // End pick table switch.
		break;
		
		default:
			System.out.print("Invalid entry. Please enter only the first letter of 'display' or 'find' in lowercase. \n");
		
		} // End choice switch.
		
	} // End user interface while loop.
		
}

// -------------------------------------------------------------
	
public static String getString() throws IOException {										// Uses a reader to create user input as a string.
				
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
String s = br.readLine();
return s;
	
} // End of getString() method.
	
// -------------------------------------------------------------
	
public static char getChar() throws IOException {
	
String s = getString();
return s.charAt(0);																			// Returns the first letter of the string, to help idiot proof it.

} // End of getChar() method.

//-------------------------------------------------------------

public static int getInt() throws IOException {
	
String s = getString();
return Integer.parseInt(s);																	// Returns the integer in the string as an Int.
	
} // End of getInt() method.
	
// -------------------------------------------------------------

} // End application class.
