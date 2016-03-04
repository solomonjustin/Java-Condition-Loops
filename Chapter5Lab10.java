package Lab10;

import java.util.Scanner;

public class Chapter5Lab10 {

	public static void main(String[] args) {
		// create scanner obj
		Scanner keyboard = new Scanner(System.in);
		
		
		//create vars
		double annualInterest, bal, months;
		
		//ask user for input
		System.out.print("Annual interest rate: ");
		annualInterest = keyboard.nextDouble();
		
		System.out.print("Starting Balance: ");
		bal = keyboard.nextDouble();
		//uses do while
		do{
			System.out.print("How long has the acct been open? (months) ");
			months = keyboard.nextDouble();
		}while(months < 1); //sentinel value
		
		SavingsAccount account1 = new SavingsAccount(annualInterest, bal);
		
		for (int i = 1; i <= months; ++i) {
			System.out.printf("How much was deposited in Month %d: ", i);
			account1.deposit(keyboard.nextDouble());
			
			System.out.printf("How much was withdrawn in Month %d: ", i);
			account1.withdrawal(keyboard.nextDouble());
			
			account1.addMonthlyInterest();
		}
		
		System.out.printf("Ending bal: $%,.2f\nDeposits: %d\nWithdrawals: %d\nTotal Interest: $%,.2f\n", account1.get_balance(), account1.getDepositCount(), account1.getWithdrawalCount(), account1.get_totalInterest());
		
		keyboard.close();

	}

}
