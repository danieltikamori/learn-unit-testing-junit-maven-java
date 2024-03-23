/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

package cc.tkmr.junit;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Use the OrderAnnotation to choose the order of the test methods
//@TestMethodOrder(MethodOrderer.MethodName.class) // Use the MethodName to choose the order of the test methods based on the method name
@TestMethodOrder(MethodOrderer.DisplayName.class) // Use the DisplayName to choose the order of the test methods based on the display name
//@TestMethodOrder(MethodOrderer.Random.class) // Use the Random to choose the order of the test methods randomly
public class ChooseTestOrderTest {

    @DisplayName("Validate something if the user is not root") // Use the DisplayName to choose the order of the test methods based on the display name
    @Order(4) // Use the OrderAnnotation to choose the order of the test methods
    @Test
    void testMethod1() {
        System.out.println("testMethod1");
    }

    @DisplayName("B")
    @Order(3)
    @Test
    void testMethod2() {
        System.out.println("testMethod2");
    }

    @Order(2)

    @DisplayName("C")
    @Test
    void testMethod3() {
        System.out.println("testMethod3");
    }

    @Order(1)

    @DisplayName("D")
    @Test
    void testMethod4() {
        System.out.println("testMethod4");
    }

}
