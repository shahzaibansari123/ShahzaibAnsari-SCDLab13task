package lab09TaskShahzaib;
import java.util.Stack;
public class Loan implements Bank{
	static void StackPush(Stack<Integer> S)
	{
		for(int i=1;i<=5;i++)
		{
			S.push(i);
		}
	}
	static void StackPop(Stack<Integer> S)
	{
		System.out.println("Customer List according to least limit extension:\n");
		int j=1;
		for(int i=1;i<=5 ;i++)
		{
			Integer Y= (Integer)S.pop();
			System.out.println(j*2+" Months left in the Limit of Customer No: " + Y);
			j++;
		}
	}
	static void StackPeek(Stack<Integer> S)
	{
		Integer element = (Integer) S.peek();
		System.out.println("\nCustomers whose extension limit is about to expire:\n Customer No:  " +element);
	}
	public void print() {
		Stack<Integer> S = new Stack<Integer>();
		StackPush(S);
		StackPop(S);
		StackPush(S);
		StackPeek(S);
	}
}
