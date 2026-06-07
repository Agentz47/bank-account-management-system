package model;

import java.util.Date;

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

    public void deposit(double amount) {

    }

    public abstract void withdraw(double amount);

}
