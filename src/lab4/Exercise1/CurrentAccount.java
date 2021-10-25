package lab4.Exercise1;

public class CurrentAccount extends Account {
	boolean flag=true;
	double bal = getBalance();
	double overdraftlimit=-1;
	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		
			bal+=amount;
			System.out.println("Deposit 2000 INR to smith account. :  "+bal);
	}

	@Override
	public void withdraw(double amount) {
		
		if(bal - amount<=overdraftlimit){
			System.out.println("Overdraft limit reached: amount cannot be withdrawn");
		}
		else
		{
			bal-=amount;
			System.out.println("Withdraw 2000 INR to Kathy account. :  "+bal);
		}

	}
	public void getaccountBalance(){
		System.out.println(bal);
	}
	
}
