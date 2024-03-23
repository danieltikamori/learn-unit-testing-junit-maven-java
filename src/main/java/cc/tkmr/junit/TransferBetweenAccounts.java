/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

package cc.tkmr.junit;

public class TransferBetweenAccounts {

    public void transfer(Account originAccount, Account destinationAccount, Double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than 0");
        }

//        originAccount.postWithdraw(amount);
//        destinationAccount.postDeposit(amount);
    }
}
