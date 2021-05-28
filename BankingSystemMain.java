package lab09TaskShahzaib;

public class BankingSystemMain {

	public static void main(String[] args) {
		BillPayments bp= new BillPayments();
		NewAccounts na= new NewAccounts();
		Loan l= new Loan();
		System.out.println("---------------------------------------------------");
		bp.print();
		System.out.println("---------------------------------------------------");
		na.print();
		System.out.println("---------------------------------------------------");
		l.print();
		System.out.println("---------------------------------------------------\n");
	}
}
