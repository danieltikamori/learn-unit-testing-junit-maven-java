# First Java project using Maven and JUnit

## Description

Learn how to build and test your first Java project with Maven and JUnit.

## Getting started

To get started with Maven, follow the [getting started guide](https://maven.apache.org/guides/getting-started/index.html).

To get started with JUnit, follow the [getting started guide](https://junit.org/junit5/docs/current/user-guide/).

### Add JUnit to your project

Open https://mvnrepository.com/search?q=junit in your browser. [Choose the latest version of JUnit Jupiter Engine](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine).

Go to Maven tab and copy the code snippet. Open the file pom.xml located at root directory. Paste it inside `<dependencies>` section.

```xml
    <dependencies>
    <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-engine -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.10.2</version>
        <scope>test</scope>
    </dependency>
        
    </dependencies>
```

### Build a project

In this example, we will create a Person class and Account class.

Create the classes with variables, constructors and methods.


### "Shorthand" syntax

Use `import static org.junit.jupiter.api.Assertions.*` to get shorthand syntax for JUnit assertions. This enables you to write more readable tests and avoid `Assertions.` use in each test.


## Annotations used in JUnit testing classes

- @BeforeEach - Run before each test
- @AfterEach - Run after each test
- @Test - Run a single test
- @BeforeAll - Run before all tests
- @AfterAll - Run after all tests
- @DisplayName - Customize the name of the test
- @Disabled - Disable the test
- @Tag - Run a test only if you have the specified tag
- @Timeout - Set a timeout
- @RepeatedTest - Run a test multiple times
- @ParameterizedTest - Run a test with multiple parameters
- @ValueSource - Run a test with multiple parameters from a list of values
- @EnumSource - Run a test with multiple parameters from an enum
- @CsvSource - is an ArgumentsSource which reads comma-separated values (CSV) from one or more CSV records supplied via the value() attribute or textBlock() attribute
- @CsvFileSource -  is an ArgumentsSource which is used to load comma-separated value (CSV) files from one or more classpath resources() or files()
- @Nested - Run a test inside another test
- @ExtendWith - Run a test with an extension
- @TempDir - Create a temporary directory
- @TempValue - Create a temporary value
- @TempInstance - Create a temporary instance
- @EnabledIf - Run a test only if a condition is true. @EnabledIf("environment.USER == 'tkmr'")
- @EnabledIfEnvironmentVariable - Run a test only if an environment variable is set. (named = "USER", matches = ".*[tT]kmr.*")
- @EnabledIfSystemProperty - Run a test only if a system property is set. (name = "user.name", matches = "tkmr")
- @DisabledIf - Run a test only if a condition is false
- @DisabledIfEnvironmentVariable - Run a test only if an environment variable is not set. (named = "USER", matches = "root")
- @DisabledIfSystemProperty - Run a test only if a system property is not set. (name = "user.name", matches = "tkmr")
- @EnabledOnOS - Run a test only on the specified operating systems. (OS.LINUX) or array of OS ({OS.LINUX, OS.MAC})
- @DisabledOnOs - Run a test only on the specified operating systems (OS.WINDOWS) or array of OS ({OS.WINDOWS, OS.MAC})
- @EnabledOnJre - Run a test only on the specified Java Runtime Environment. (JAVA_17)
- @EnabledForJreRange - Run a test only on the specified Java Runtime Environment. (min = JAVA_11, max = JAVA_17)
- @DisabledOnJre - Run a test only on the specified Java Runtime Environment
- @EnabledOnJdk - Run a test only on the specified Java Development Kit
- @DisabledOnJdk - Run a test only on the specified Java Development Kit

### Testing

Right click anywhere in the class Person and select Generate..., then select Test.
Select the methods you want to test. It will generate a test class inside the test directory.

You may also create your own test inside this new class as in this example code.
Or create a new test class at the test directory.

After creating your test, run the test class.

## Reference

https://junit.org/junit5/
https://github.com/junit-team/junit5/
https://www.baeldung.com/junit-5-gradle
https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html


