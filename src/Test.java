
public class Test extends Account{

	public Test(int id, double balance){
		super(id,balance);
		
		
	}
	

	public static void main(String [] args) throws InsufficientFundsException{
		Test testacct = new Test(1122,20000);
		testacct.setAnnualInterestRate(.045);
		testacct.withdraw(25000);
		testacct.deposit(3000);
		System.out.println(testacct.getBalance());
		System.out.println(testacct.getMonthlyInterstRate());
		System.out.println(testacct.getDateCreated());
		
	   }
}
