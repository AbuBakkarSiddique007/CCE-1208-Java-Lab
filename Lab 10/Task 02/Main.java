/*
* Task No: 09.1
 * Task Name:
 * Create an interface ATMService and
 * implement it in a class DBBL with methods:
 * withdraw(), deposit(), and checkBalance().
 */

interface ATMService {
    void deposit(double amount);

    void withdraw(double amount);

    void checkBalance();
}

class DBBL implements ATMService {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        DBBL atm = new DBBL();

        atm.deposit(1000);
        atm.checkBalance();
        atm.withdraw(300);
        atm.checkBalance();
    }
}
