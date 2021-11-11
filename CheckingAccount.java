
public class CheckingAccount extends BankAccount {
	private static final int FEE = 15;

	public CheckingAccount(String n, double a) {
		super(n,a);
		setAccountNumber(getAccountNumber() + "-10");
	}

	public boolean withdraw(double amount)
	{
		boolean completed = true;
		double b = 0.0;
		if (amount <= getBalance())
		{
			b = (getBalance() - amount) - FEE;
			setBalance(b);
		}
		else
		{
			completed = false;
		}
		return completed;
	}


}
