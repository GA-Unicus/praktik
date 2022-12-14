package com.unicus.sv.ga.praktik.tauut.chapter4.bankService.exceptions;

/**
 * Thrown whenever an invalid amount is passed to a given transaction.
 * @author Tariq King
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("Invalid amount for transaction.");
    }

}