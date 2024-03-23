    /*
     * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
     */

    import org.junit.jupiter.api.Assertions;
    import org.junit.jupiter.api.Test;

    import java.time.LocalDateTime;

    // StaticImport the necessary Assertion classes from JUnit and eliminate the need write "Assertions." everytime.
    import static org.junit.jupiter.api.Assertions.*;

    public class AssertionsTest {

        @Test
        void validateEntry() {

            int[] firstEntry = {10, 20, 30, 40, 50};

            // assertArrayEquals is used to compare two arrays with same lengths if they have equal elements. But it will fail if the arrays have different lengths.
            //org.opentest4j.AssertionFailedError: array lengths differ,
            //Expected :5
            //Actual   :52
    //        int[] secondEntry = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};

            //org.opentest4j.AssertionFailedError: array contents differ at index [0],
            //Expected :10
            //Actual   :-1
    //        int[] secondEntry = {-1, -2, 2, 4, 5};


            //org.opentest4j.AssertionFailedError: array contents differ at index [1],
            //Expected :20
            //Actual   :2
    //        int[] secondEntry = {10, 2, 3, 4, 5};

            // This assertion will pass
    //        int[] secondEntry = {10, 20, 30, 40, 50};

    //        Assertions.assertArrayEquals(firstEntry, secondEntry);

            // Validates if the two arrays are not equal
            int[] secondEntry = {10, 20, 30, 40, 50};
            Assertions.assertNotEquals(firstEntry, secondEntry);
        }

            @Test
            void validateIfObjectIsNull() {

            Person person = null;
                // Validates if the object is null
                Assertions.assertNull(person);

            person = new Person("Nakamoto", LocalDateTime.now());

            Assertions.assertNotNull(person);
        }

        @Test
        void validateNumbersOfDifferentTypes() {
            double value = 6.0;
            double anotherValue = 6.0;

            Assertions.assertEquals(value, anotherValue);
        }

        @Test
        void validateSomeConditionIsFalse() {
            boolean condition = 5 + 6 == 12;
            // With Import static, there's no need to write Assertions.
            assertFalse(condition);
        }

        @Test
        void validateSomeConditionIsTrue() {
            boolean condition = 6 + 6 == 12;
            // With Import static, there's no need to write Assertions.
            assertTrue(condition);
        }

    }
