package guviTask10;

public class Account {
	private String accountNumber;
	private String accountName;
	private double balance;

	// Constructor without arguments
	public Account() {
		this.accountNumber = "";
		this.accountName = "";
		this.balance = 0.0;
	}

	// Constructor with two arguments
	public Account(String accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = 0.0;
	}

	// Create a method to deposit balance
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println(amount + " deposited successfully.");
		} else {
			System.out.println("Invalid amount.");
		}
	}

	// Create a method to withdraw balance
	public void withdraw(double amount) {
		if (amount > 0 && amount <= this.balance) {
			this.balance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	// Create a method to check balance
	public void checkBalance() {
		System.out.println("Account Holder: " + this.accountName);
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Current Balance: " + this.balance);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// Print the result
		System.out.println("Passing no arguments");
		Account account = new Account();
		account.deposit(10000);
		account.withdraw(500);
		account.checkBalance();

		System.out.println();

		System.out.println("Passing the two arguments");
		Account account1 = new Account("7871784765", "Hariharan Parameswaran");
		account1.deposit(24000);
		account1.checkBalance();
		account1.withdraw(3584);
		account1.checkBalance();
	}
}

//  Output :
//	  Passing no arguments
//	  10000.0 deposited successfully.
//	  500.0 withdrawn successfully.
//	  Account Holder: 
//	  Account Number: 
//	  Current Balance: 9500.0
//
//	  Passing the two arguments
//	  24000.0 deposited successfully.
//	  Account Holder: Hariharan Parameswaran
//	  Account Number: 7871784765
//	  Current Balance: 24000.0
//	  3584.0 withdrawn successfully.
//	  Account Holder: Hariharan Parameswaran
//	  Account Number: 7871784765
//	  Current Balance: 20416.0
