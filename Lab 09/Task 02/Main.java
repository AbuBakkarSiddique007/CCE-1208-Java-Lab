// BankAccount class using encapsulation
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Setter methods
    public void setAccountHolder(String name) {
        accountHolder = name;
    }

    public void setAccountNumber(String accNumber) {
        accountNumber = accNumber;
    }

    public void setBalance(double bal) {
        balance = bal;
    }

    // Method to display account info securely
    public void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
}

// Main class to test BankAccount
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Setting values
        account.setAccountHolder("Abu Bakkar Siddique");
        account.setAccountNumber("ACC2025498");
        account.setBalance(15000.75);

        // Displaying account info
        account.showAccountInfo();
    }
}
