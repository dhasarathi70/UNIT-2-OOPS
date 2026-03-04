import java.util.*;

abstract class BankAccount {
    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited $%.1f to Savings Account. New balance: $%.1f\n", amount, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.1f from Savings Account. New balance: $%.1f\n", amount, balance);
        } else {
            System.out.println("Insufficient balance in Savings Account!");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited $%.1f to Current Account. New balance: $%.1f\n", amount, balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew $%.1f from Current Account. New balance: $%.1f\n", amount, balance);
        } else {
            System.out.println("Insufficient balance in Current Account!");
        }
    }
}
