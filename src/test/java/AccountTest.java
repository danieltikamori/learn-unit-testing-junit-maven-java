/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

// Import the necessary Assertion classes from JUnit
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Define the AccountTest class for testing the Account class
class AccountTest {

//    @org.junit.jupiter.api.Test

    // Test method to validate the balance calculations in the Account class
    @Test
    void validateBalance() {

        // Create an instance of the Account class with an initial balance of 1000.00
        Account account = new Account("123456789", 1000.00);
        // Assert that the account instance is not null
        Assertions.assertNotNull(account);

        // Deposit 500.00 into the account
        account.postDeposit(500.00);
        // Assert that the balance is updated correctly after the deposit
        Assertions.assertEquals(1500.00, account.getBalance());

        // Withdraw 500.00 from the account
        account.postWithdraw(500.00);
        // Assert that the balance is updated correctly after the withdrawal
        Assertions.assertEquals(1000.00, account.getBalance());
        // Assert that the balance is not equal to 1001.00
        Assertions.assertNotEquals(1001.00, account.getBalance());

        // Set the account instance to null
        account = null;
        // Assert that the account instance is null
        Assertions.assertNull(account);
    }
}