package lab4.Exercise1;

public class Account {

	private long accNum;
	private double balance;
	final double minbal = 1500;
	
	Person accHolder;
	
	Account() {}

	public Account(long accNum, double balance,Person accHolder) {
		
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder=accHolder;
	}
		
	void deposit(double d)
	{		
		balance += d;
		System.out.println("Deposit 2000 INR to smith account. :  "+balance);
		
	}
	void withdraw(double amount)
	{
		if(balance - amount<minbal){
			System.out.println("Ammount cannot be withdrawn due to minimum balance issue");
		}
		else{
			balance-=amount;
			System.out.println("Withdraw 2000 INR from Kathy account :  "+balance);
		}
	}
	double getBalance()
	{
		return balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}
