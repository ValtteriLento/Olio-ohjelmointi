package viikko6;

public class Bank {

    public void addAccount(String account, int amount, int credit) {
        if (credit == 0) {
            System.out.println("Adding to bank: " + account + "," + amount);
        } else {
			System.out.println("Adding to bank: " + account + "," + amount + "," + credit);
		}
    }

    public void removeAccount() {
		System.out.println("Account removed.");
	}
    
    public void searchAccount(String account) {
		System.out.println("Searching for account: " + account);
	}

    public void depositMoney(String account, int amount) {
		System.out.println("Depositing to the account: " + account + " the amount " + amount);
	}

    public void withdrawMoney(String account, int amount) {
		System.out.println("Withdrawing from the account: " + account + " the amount " + amount);
	}
}