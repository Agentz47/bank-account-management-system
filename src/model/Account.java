package model;

public abstract class Account {

    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    //private String nicNumber;
    //private String phone;
    //private String email;
    //private boolean isBlocked;

    public Account(
            int accountNumber,
            String accountHolderName,
            double balance
    ) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {

        if (amount <= 0) {

            System.out.println("Invalid Amount!");

            return;
        }

        balance += amount;

        System.out.println("Deposit Successful!");

    }

    public abstract void withdraw(double amount);


    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

}
