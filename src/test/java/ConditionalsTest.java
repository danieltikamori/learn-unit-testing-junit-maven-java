/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.condition.JRE.*;

public class ConditionalsTest {

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root") // Disable the test if the user is root
    void validateSomethingIfUserIsNotRoot() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(value = OS.LINUX) // Enable the test if the operating system is Linux
    void validateSomethingIfOperatingSystemIsLinux() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC}) // Enable the test if the operating system is Linux or Mac
    void validateSomethingIfOperatingSystemIsLinuxOrMac() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JAVA_8) // Enable the test if the Java version is Java 8
    void validateSomethingIfJavaVersionIsJava8() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre({JAVA_8, JAVA_11}) // Enable the test if the Java version is Java 8 or Java 11
    void validateSomethingIfJavaVersionIsJava8OrJava11() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17) // Enable the test if the Java version is between Java 11 and Java 17
    void validateSomethingIfJavaVersionIsBetweenJava8AndJava17() {

        // Perform an assertion to check if 10 is equal to the sum of 5 and 5
        assertEquals(10, 5 + 5);
    }

}
