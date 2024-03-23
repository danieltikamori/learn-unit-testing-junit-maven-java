/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

package cc.tkmr.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

/*
 * This class defines the test cases for the cc.tkmr.junit.Person class.
 */

// Test class for the cc.tkmr.junit.Person class
class PersonTest {

    // Test case to ensure age calculation is correct
    @Test
    void mustCalculateAgeCorrectly() { // Name based on the test validation intention
        // Create a cc.tkmr.junit.Person object for John with a birthdate of 2000-01-01
        Person John = new Person("John", LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        // Check if the age calculated for John is 24
        Assertions.assertEquals(24, John.getAge());
    }

    // Test case to check if a person is an adult
    @Test
    void mustCheckIfPersonIsAdult() {
        // Create a cc.tkmr.junit.Person object for John with a birthdate of 2000-01-01
        Person John = new Person("John", LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        // Check if John is an adult
        Assertions.assertTrue(John.isAdult());

        // Create a cc.tkmr.junit.Person object for Jane with the current date
        Person Jane = new Person("Jane", LocalDateTime.now());
        // Check if Jane is an adult
        Assertions.assertFalse(Jane.isAdult());
    }

    // Test case to validate object equality
    @Test
    void validateEquality() {
        // Create a cc.tkmr.junit.Person object
        Person person = new Person("cc.tkmr.junit.Person 1", LocalDateTime.now());
        // Check if the same object reference is returned
        Assertions.assertSame(person, person);
    }

}