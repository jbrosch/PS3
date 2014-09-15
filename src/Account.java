import java.sql.Date;


public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	//No arg constructor
	public Account(){
		//this (0,0);
	}

	//Constructor 
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	//Accessor methods
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}

	//Mutator methods
	public void setId(int id){
		this.id=id;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate=annualInterestRate;
	}

	public double getMonthlyInterstRate(){
		return annualInterestRate/12;
	}

	public void withdraw(double amount) throws
	InsufficientFundsException
	{
		if(amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public void deposit(double amount){
		balance+=amount;
	}


}
