package College;

import java.util.Scanner;

class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Current Balance: " + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            System.out.println("Error: Withdrawal amount must be positive.");
        }
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create Account:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Account Number: ");
        String accountNumber = sc.nextLine();
        System.out.print("Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        System.out.print("Deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

    }
}

