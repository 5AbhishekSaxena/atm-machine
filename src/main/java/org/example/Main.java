package org.example;

import org.example.exception.ATMException;
import org.example.ui.ATMMachineDriver;

public class Main {
    public static void main(String[] args) {
        ATMMachineDriver atmMachineDriver = new ATMMachineDriver();

        try {
            atmMachineDriver.run();
        } catch (ATMException exception) {
            String message =
                    exception.getMessage() == null || exception.getMessage().isEmpty()
                            ? "Something went wrong. Please try again!" : exception.getMessage();
            System.out.println(message);
        }
    }
}