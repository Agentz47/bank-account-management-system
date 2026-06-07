package service;

import model.Account;
import model.SavingsAccount;

import java.util.ArrayList;

public class AccountService {

    private ArrayList<Account> accounts =
            new ArrayList<>();

    public boolean accountNumberExists(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return true;
            }
        }
        return false;
    }
    public void addAccount(Account account) {

        accounts.add(account);

    }

    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No Accounts Found!");
            return;
        }

        for (Account account : accounts) {
            account.displayAccount();
            System.out.println();
        }
    }

    public void searchAccount(int accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                System.out.println("Account Found!");
                account.displayAccount();
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    public void deleteAccount(int accountNumber) {
        Account accountToDelete = null;
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accountToDelete = account;
                break;
            }
        }

        if (accountToDelete != null) {

            accounts.remove(accountToDelete);
            System.out.println("Account Deleted Successfully!");

        } else {

            System.out.println("Account Not Found!");
        }
    }

    public void depositToAccount(
            int accountNumber,
            double amount
    ) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.deposit(amount);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    public void withdrawFromAccount(
            int accountNumber,
            double amount
    ) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.withdraw(amount);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }
}
