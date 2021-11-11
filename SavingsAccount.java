/*Class: CMSC203
 * Instructor: Dr.Alexander
 * Due 11/11/21
 * Platform compiler:
 * I pledge that I have completed the programming assignment independently
 * I have not copied the code from a student or any source
 * I have not given my code to any student
 * David Abili
 */
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
