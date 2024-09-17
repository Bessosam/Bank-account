package wacoco.se;
public class BankAccount {
    // Private fields for account balance and account holder's name
    private double balance;
    private String accountHolder;

    // Constructor to initialize the account
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;

    // Ensure that the initial balance is positive
        if (initialBalance> 0) {
        this.balance = initialBalance;
        } else {
            System.out.println("Initial balance must be positive. Exiting program.");
            System.exit(0);  // Exit the program if the balance is not positive
        }
    }



    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the account balance
    public void checkBalance() {
        System.out.println("Account balance: $" + balance);
    }

    // Method to display account holder's name
    public void displayAccountHolder() {
        System.out.println("Account holder: " + accountHolder);
    }
}
