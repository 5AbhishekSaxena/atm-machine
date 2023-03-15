package org.example.service;

import org.example.exception.ATMException;

public class ATM {

    private double balance = 100.0;

    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws ATMException {
        if (balance < amount) 
            throw new ATMException("Insufficient amount!! As the amount in your account is:" + balance);
        balance -= amount;
    }

    public void deposit(double amount) {
        if(amount<=0)
            throw new ATMException("Invalid amount");
        balance += amount;
    }
}
