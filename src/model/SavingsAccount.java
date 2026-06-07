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

    }
}
