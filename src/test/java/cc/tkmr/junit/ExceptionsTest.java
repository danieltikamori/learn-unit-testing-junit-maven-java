/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

package cc.tkmr.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * This class is for testing exceptions in the TransferBetweenAccounts class.
 */

public class ExceptionsTest {

    @Test
    void validateExceptionScenarioAtMoneyTransfer() {
        // Creating two account objects
        Account orignAccount = new Account("123456789", 1000.00);
        Account destinationAccount = new Account("987654321", 1000.00);

        TransferBetweenAccounts transferBetweenAccounts = new TransferBetweenAccounts();

        // There's basically 2 ways to test exceptions in JUnit:

        // Validating that an IllegalArgumentException is thrown when transferring 0 money
        assertThrows(IllegalArgumentException.class, () -> transferBetweenAccounts.transfer(orignAccount, destinationAccount, (double) 0)); // (double) 0 = 0.0 - casting from int to double

        // Validating that no exception is thrown when transferring a non-zero amount of money
        assertDoesNotThrow(() -> transferBetweenAccounts.transfer(orignAccount, destinationAccount, (double) 1));

    }
}