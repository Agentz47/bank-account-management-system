package model;

public class CurrentAccount extends Account{

    public CurrentAccount(
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

        if (balance - amount >= -5000) {
            balance -= amount;

            System.out.println("Withdraw Successful!");

            return true;

        } else {

            System.out.println("Overdraft Limit Exceeded!");

            return false;
        }
    }
}
