package org.example.service;

import org.example.exception.ATMException;

public class ATM {

    private double balance = 100.0;

    public void printBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) throws ATMException {
        //throw new ATMException("Method has not been implemented");
        if(amount < 0){
        System.out.println("Invalid , Please check again");
        }
        else if(amount > balance){
            System.out.println("Withdraw amount is higher than the balance in the account");
        }
        else{
            balance-=amount;
            System.out.println("Withdrawal Successful , Current Balance:"+balance);
        }    
    }
}
