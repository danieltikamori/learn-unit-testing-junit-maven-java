/*
 * This class manages the database connection and data operations.
 */
import java.util.logging.Logger;

// Used to test and learn about @BeforeAll, @AfterAll, @BeforeEach, @AfterEach
// AfterBeforeTest.java

public class DatabaseConnectionManager {

    // Initialize the logger for this class
    private static final Logger LOGGER = Logger.getLogger(DatabaseConnectionManager.class.getName());

    // Method to begin a database connection
    public static void beginConnection() {
        // Perform the actions to begin the database connection
        LOGGER.info("Began connection");
    }

    // Method to close the database connection
    public static void closeConnection() {
        // Perform the actions to close the database connection
        LOGGER.info("Closed connection");
    }

    // Method to insert person data into the database
    public static void insertData(Person person) {
        // Perform the actions to insert person data into the database
        LOGGER.info("Inserted data");
    }

    // Method to update person data in the database
    public static void updateData(Person person) {
        // Perform the actions to update person data in the database
        LOGGER.info("Updated data");
    }

    // Method to delete person data from the database
    public static void deleteData(Person person) {
        // Perform the actions to delete person data from the database
        LOGGER.info("Deleted data");
    }
}