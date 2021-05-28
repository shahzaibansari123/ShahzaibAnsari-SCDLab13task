package lab09TaskShahzaib;
import java.util.ArrayList;
import java.util.List;
public class BillPayments implements Bank {
	public void print() {
		List<String> customers = new ArrayList<String>();
		
		customers.add("Shahzaib");
		customers.add("Tooba");
		customers.add("Rushal");
		customers.add("Fahad");
		
		System.out.println("Customers List for Payments:");
		System.out.println(customers);
		
		System.out.println("\nCustomers List for Pending Payments:");
		customers.remove(3);
		customers.remove(2);
		System.out.println(customers);
		
		
		//changes in branch(main2) file by adding few comments
			//name: Shahzaib Ansari
			//rollno:2019-SE-249
			//section: E
		
		
	}
}
