/*
 * Task No: 1
 * Task Name: Create a BankAccount Class with Static Members
 * Task Description:
 * - Create a class BankAccount with the following attributes:
 *   - accountNumber
 *   - accountHolderName
 *   - balance
 *   - Static variable: bankName = "Sonali Bank"
 *
 * - Implement a constructor to initialize account details.
 * - Create a static method showBankName() to display the bank name.
 * - In the main class, create two BankAccount objects and display their information.
 */

class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    static String bankName = "Sonali Bank";

    BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class Main {
    public static void main(String args[]) {
        BankAccount account1 = new BankAccount("1001", "Abu Bakkar", 1000.00);
        BankAccount account2 = new BankAccount("1002", "Riki Ahmed", 2000.00);

        BankAccount.showBankName();

        System.out.println("\nAccount 1 UserInfo Details:");
        account1.displayAccountInfo();

        System.out.println("Account 2 UserInfo Details:");
        account2.displayAccountInfo();
    }
}
