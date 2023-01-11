package org.example.ui;

import org.example.exception.ATMException;
import org.example.service.ATM;

import java.util.Scanner;

public class ATMMachineDriver {

    private final Scanner scanner = new Scanner(System.in);
    private final ATM atm = new ATM();

    public void run() throws ATMException {
        System.out.println("ATM Machine");
        atm.printBalance();
        withdrawMoney();
    }

    private void withdrawMoney() throws ATMException {
        System.out.print("Enter withdraw amount(₹): ");
        double amount = Double.parseDouble(scanner.next());
        atm.withdraw(amount);
        System.out.println("Amount withdrawn successfully!");
        atm.printBalance();
    }
}
