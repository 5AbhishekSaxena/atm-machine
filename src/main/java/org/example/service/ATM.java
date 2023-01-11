package org.example.service;

import org.example.exception.ATMException;

public class ATM {

    private double balance = 100.0;

    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws ATMException {
        throw new ATMException("Method has not been implemented");
    }
}
