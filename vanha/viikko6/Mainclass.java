package viikko6;

import java.util.Scanner;

public class Mainclass {
    
    public static void main(String[] args) {

        int choice = 1;
        String account = "";
        int amount;
        int credit;
        Bank bank = new Bank();
        Scanner scan = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("\n*** BANK SYSTEM ***");
			System.out.println("1) Add a regular account");
			System.out.println("2) Add a credit account");
			System.out.println("3) Deposit money");
			System.out.println("4) Withdraw money");
			System.out.println("5) Remove an account");
			System.out.println("6) Print account information");
			System.out.println("7) Print all accounts");
			System.out.println("0) Quit");
			System.out.print("Your choice: ");
			choice = scan.nextInt();
            if (choice == 1) {
                System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
                amount = scan.nextInt();
                bank.addAccount(account, amount, 0);
            } else if (choice == 2) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
				amount = scan.nextInt();
				System.out.print("Give a credit limit: ");
				credit = scan.nextInt();
				bank.addAccount(account, amount, credit);
			} else if (choice == 3) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to deposit: ");
				amount = scan.nextInt();
				bank.depositMoney(account, amount);
			} else if (choice == 4) {
				System.out.print("Give an account number: ");
				account = scan.next();
				System.out.print("Amount of money to withdraw: ");
				amount = scan.nextInt();
				bank.withdrawMoney(account, amount);
			} else if (choice == 5) {
				System.out.print("Give the account number of the account to delete: ");
				account = scan.next();
				bank.removeAccount();
			} else if (choice == 6) {
				System.out.print("Give the account number of the account to print information from: ");
				account = scan.next();
				bank.searchAccount(account);
			} else if (choice == 7) {
				System.out.println("All accounts:");
			} else if (choice == 0) {
				scan.close();
			} else {
				System.out.println("Invalid choice.");
			}
        }
    }
}