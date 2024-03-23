/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

/*
 * This is a test class for testing the functionality of the BeforeAll, AfterAll, BeforeEach, and AfterEach Before Annotation.
 */

import org.junit.jupiter.api.*;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class contains test methods for the AfterBeforeTest class.
 */
public class AfterBeforeTest {

    /**
     * Before all tests in this class
     * Sets up a database connection before all tests in this class.
     */
    @BeforeAll
    static void connectionSetup() {
        DatabaseConnectionManager.beginConnection();
    }

    /**
     * Before EACH test method. Runs before each test method.
     * Inserts data for testing before each test method.
     */
    @BeforeEach
    void insertDataForTesting() {
        DatabaseConnectionManager.insertData(new Person("Nakamoto", LocalDateTime.of(2000, 1, 1, 0, 0, 0)));
    }

    /**
     * After EACH test method. Runs after each test method.
     * Deletes data after each test method.
     */
    @AfterEach
    void deleteDataForTesting() {
        DatabaseConnectionManager.deleteData(new Person("Nakamoto", LocalDateTime.of(2000, 1, 1, 0, 0, 0)));
    }

    /**
     * Test method to validate the return data.
     */
    @Test
    void validateReturnData() {
        assertTrue(true);
    }

    /**
     * Test method to validate the return data as null.
     */
    @Test
    void validateReturnData2() {
        assertNull(null);
    }

    /**
     * After all tests in this class. Runs after all tests in this class.
     * Closes the database connection after all tests in this class.
     */
    @AfterAll
    static void closeConnection() {
        DatabaseConnectionManager.closeConnection();
    }

}