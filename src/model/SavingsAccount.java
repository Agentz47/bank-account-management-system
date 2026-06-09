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
    public boolean withdraw(double amount){

        if (balance - amount >= 0) {
            balance -= amount;

            System.out.println("Withdraw Successful!");

            return true;

        } else {

            System.out.println("Insufficient Balance!");

            return false;
        }

    }
}
