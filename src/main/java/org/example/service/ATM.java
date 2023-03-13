package org.example.service;

import org.example.exception.ATMException;

public class ATM {

    private double balance = 100.0;

    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }
    
    public void deposit(double amount) throws ATMException {
    if (amount <= 0) {
        throw new ATMException("Invalid deposit amount");
    }
    balance += amount;
    System.out.println("Deposit successful. Current balance: " + balance);
}


//     public void withdraw(double amount) throws ATMException {
//         throw new ATMException("Method has not been implemented");
//     }
     public void withdraw(double amount) throws ATMException {
        if (amount <= 0) {
            throw new ATMException("Invalid withdrawal amount");
        }
        if (amount > balance) {
            throw new ATMException("Insufficient funds");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Current balance: " + balance);
    }
    
}
