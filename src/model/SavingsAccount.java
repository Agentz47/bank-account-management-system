package model;

public class SavingsAccount extends Account {
    public SavingsAccount(
            int accountNumber,
            String accountHolderName,
            double balance
    ) {
        super(
                accountNumber,
                accountHolderName,
                balance
        );

    }
    @Override
    public void withdraw(double amount){

        if (balance - amount >= 0) {
            balance -= amount;

            System.out.println("Withdraw Successful!");

        } else {

            System.out.println("Insufficient Balance!");
        }

    }
}
