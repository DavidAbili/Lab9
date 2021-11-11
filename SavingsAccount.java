
public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String n, double a ) {
		super(n,a);
		accountNumber = getAccountNumber();
	}

	public SavingsAccount(BankAccount n, double a ) {
		super(n,a);
		  accountNumber = super.getAccountNumber()+ savingsNumber++;
		savingsNumber +=1;
	}

	public void postInterest() {
		double a = getBalance() * rate/12;
		a += getBalance();	
		setBalance(a);
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

}
