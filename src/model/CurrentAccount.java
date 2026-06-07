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
    public void withdraw(double amount){

        if (balance - amount >= -5000) {
            balance -= amount;

            System.out.println("Withdraw Successful!");

        } else {

            System.out.println("Overdraft Limit Exceeded!");
        }
    }
}
