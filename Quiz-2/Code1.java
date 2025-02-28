class BankAccount {
    private String accountNumber;
    private double balance;

    // Constructor(J)
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //setter
    public void setNumber(String accountNumber) {
    	this.accountNumber = accountNumber;
    }
    public void setbalence(double balance) {
    	this.balance = balance;
    }
    //getter
    public String getNumber() {
    	return accountNumber;
    }
    public double getbalance() {
    	return balance;
    }

    //Deposit(I)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    //Withdraw(S)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    //Display(U)
    public void display() {
        System.out.println("Account Number: " + getNumber());
        System.out.println("Balance: " + getbalance());
    }
}

public class Main{
	//Main(N)
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 500.0);

        System.out.println("Before transactions:");
        account1.display();

        account1.deposit(200);
        account1.withdraw(100);

        System.out.println("After transactions:");
        account1.display();
    }
}
//CT02 Code-1 by Ashura105
