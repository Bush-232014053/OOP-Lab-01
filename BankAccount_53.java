/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount_53;

/**
 *
 * @author pc
 */
public class BankAccount_53 {
    private int accountNumber;
    private double balance;

    public BankAccount_53(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposited $%.2f. New balance: $%.2f%n", amount, this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.printf("Withdrew $%.2f. New balance: $%.2f%n", amount, this.balance);
        } else {
            System.out.printf("Insufficient funds. Balance: $%.2f%n", this.balance);
        }
    }
}
public class main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, 1000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
    }
}