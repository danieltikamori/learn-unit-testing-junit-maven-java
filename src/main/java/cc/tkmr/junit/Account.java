/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

package cc.tkmr.junit;

public class Account {
    private String AccountNumber;
    private double Balance;

    public Account(String AccountNumber, double Balance){
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void postDeposit(double amount){
        this.Balance += amount;
    }

    public void postWithdraw(double amount){
        this.Balance -= amount;
    }
}
