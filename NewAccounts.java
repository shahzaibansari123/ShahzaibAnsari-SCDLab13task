package lab09TaskShahzaib;
import java.util.LinkedList;
import java.util.Queue;
public class NewAccounts implements Bank {
	public void print() {
		Queue<String> q =  new LinkedList<String>();
		
		q.add("Shezi");
		q.add("Shareh");
		q.add("fahad");
		q.add("Khubaib");
		
		System.out.println("Customers List for new Accounts:");
		System.out.println(q);
	}
}
