package com.techtez;

public class AbstractionExample {

	public static void main(String[] args) {
		ATMOperations atm = new BankATM(); // Use interface for abstraction

		atm.checkBalance(); // Output: Current balance: 5000
		atm.deposit(1000); // Output: Deposit successful. New balance: 6000
		atm.withdraw(2000); // Output: Withdrawal successful. New balance: 4000
		atm.withdraw(7000); // Output: Insufficient balance.
	}
}
	// Interface for abstraction
		interface ATMOperations 
		{
			void withdraw(double amount);

			void checkBalance();

			void deposit(double amount);
		}

		// Implementation of the ATM interface
		class BankATM implements ATMOperations 
		{
			private double balance = 5000; // Example initial balance

			@Override
			public void withdraw(double amount)
			{
				if (amount > balance)
				{
					System.out.println("Insufficient balance.");
				} 
				else 
				{
					balance -= amount;
					System.out.println("Withdrawal successful. New balance: " + balance);
				}
			}

			@Override
			public void checkBalance() 
			{
				System.out.println("Current balance: " + balance);
			}

			@Override
			public void deposit(double amount)
			{
				balance += amount;
				System.out.println("Deposit successful. New balance: " + balance);
			}
		}

	


