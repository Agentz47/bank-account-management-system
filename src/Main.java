import model.Account;
import model.CurrentAccount;
import model.SavingsAccount;
import service.AccountService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        AccountService accountService = new AccountService();

        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {

            System.out.println("\n==== ACCOUNT MENU ====");
            System.out.println("1. Add Saving Account");
            System.out.println("2. Add Current Account");
            System.out.println("3. View Account");
            System.out.println("4. Search Account");
            System.out.println("5. Delete Account");
            System.out.println("6. Deposit Money");
            System.out.println("7. Withdraw Money");
            System.out.println("8. Transfer Money");
            System.out.println("9. Exit");

            System.out.println("Enter Choice: ");

            int choice;

            try {

                choice = scanner.nextInt();
                scanner.nextLine();

            } catch (InputMismatchException e) {

                System.out.println("Please enter a number!");

                scanner.nextLine();

                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (accountNumber <= 0) {
                        System.out.println("Enter a valid account number!");

                        break;
                    }

                    if (accountService.accountNumberExists(accountNumber)) {

                        System.out.println("Account number already exists!");

                        break;
                    }

                    System.out.println("Enter Account Holder Name: ");
                    String accountHolderName = scanner.nextLine();
                    if (accountHolderName.isBlank()) {

                        System.out.println("Name cannot be empty!");

                        break;
                    }

                    System.out.println("Enter Account Balance");
                    double balance = scanner.nextDouble();
                    scanner.nextLine();

                    if (balance < 1000 ) {
                        System.out.println("Please Deposit Minimum 1000 While Creating a Saving Account!");

                        break;
                    }

                    SavingsAccount newSavingAccount = new SavingsAccount(accountNumber, accountHolderName, balance);

                    accountService.addAccount(newSavingAccount);

                    System.out.println("Saving Account Created Successfully");

                    break;

                case 2:
                    System.out.println("Enter Account Number: ");
                    int currentAccountNumber = scanner.nextInt();
                    scanner.nextLine();

                    if (currentAccountNumber <= 0) {
                        System.out.println("Enter a valid account number!");

                        break;
                    }

                    if (accountService.accountNumberExists(currentAccountNumber)) {

                        System.out.println("Account number already exists!");

                        break;
                    }

                    System.out.println("Enter Account Holder Name: ");
                    String currentAccountHolderName = scanner.nextLine();
                    if (currentAccountHolderName.isBlank()) {

                        System.out.println("Name cannot be empty!");

                        break;
                    }

                    System.out.println("Enter Account Balance");
                    double CurrentAccountBalance = scanner.nextDouble();
                    scanner.nextLine();

                    if (CurrentAccountBalance <= -5000 ) {
                        System.out.println("Account cannot be overdraft -5000!");

                        break;
                    }

                    CurrentAccount newCurrentAccount = new CurrentAccount(currentAccountNumber, currentAccountHolderName, CurrentAccountBalance);

                    accountService.addAccount(newCurrentAccount);

                    System.out.println("Current Account Created Successfully!");

                    break;

                case 3:

                    accountService.displayAllAccounts();

                    break;

                case 4:

                    System.out.println("Enter Account Number: ");

                    int searchAccountNumber = scanner.nextInt();
                    scanner.nextLine();

                    accountService.searchAccount(searchAccountNumber);

                    break;

                case 5:

                    System.out.println("Enter Account Number to Delete: ");
                    int deleteAccountNumber = scanner.nextInt();
                    scanner.nextLine();

                    accountService.deleteAccount(deleteAccountNumber);

                    break;

                case 6:

                    System.out.println("Enter the Deposit Account Number: ");
                    int depositAccountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the Amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();

                    accountService.depositToAccount(depositAccountNumber, depositAmount);

                    break;

                case 7:

                    System.out.println("Enter the Account Number for Withdraw: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();

                    accountService.withdrawFromAccount(withdrawAccountNumber, withdrawAmount);

                    break;

                case 8:




                case 9:

                    System.out.println("Goodbye!");

                    running = false;

                    break;

                default:

                    System.out.println("Invalid choice!");

                    break;
            }
        }
    }
}
