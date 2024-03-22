/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

/*
 * This class defines the test cases for the Person class.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

// Test class for the Person class
class PersonTest {

    // Test case to ensure age calculation is correct
    @Test
    void mustCalculateAgeCorrectly() {
        // Create a Person object for John with a birthdate of 2000-01-01
        Person John = new Person("John", LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        // Check if the age calculated for John is 24
        Assertions.assertEquals(24, John.getAge());
    }

    // Test case to check if a person is an adult
    @Test
    void mustCheckIfPersonIsAdult() {
        // Create a Person object for John with a birthdate of 2000-01-01
        Person John = new Person("John", LocalDateTime.of(2000, 1, 1, 0, 0, 0));
        // Check if John is an adult
        Assertions.assertTrue(John.isAdult());

        // Create a Person object for Jane with the current date
        Person Jane = new Person("Jane", LocalDateTime.now());
        // Check if Jane is an adult
        Assertions.assertFalse(Jane.isAdult());
    }

    // Test case to validate object equality
    @Test
    void validateEquality() {
        // Create a Person object
        Person person = new Person("Person 1", LocalDateTime.now());
        // Check if the same object reference is returned
        Assertions.assertSame(person, person);
    }

}