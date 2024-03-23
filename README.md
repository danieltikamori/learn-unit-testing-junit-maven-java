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

In this example, we will create a cc.tkmr.junit.Person class and cc.tkmr.junit.Account class.

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

Right click anywhere in the class cc.tkmr.junit.Person and select Generate..., then select Test.
Select the methods you want to test. It will generate a test class inside the test directory.

You may also create your own test inside this new class as in this example code.
Or create a new test class at the test directory.

After creating your test, run the test class.

## Best Practices

Not tested code is automatically a not reliable code.

- Use `@DisplayName` to customize the name of the test
- Use `@Tag` to run a test only if you have the specified tag
- Use `@Timeout` to set a timeout
- Use `@Disabled` to disable the test

### Simplicity

- Meaningful Names
- How easy is to read the test

### Early testing

- Try to write unit tests before the code itself, it may help design better the code
- See Test Driven Development (TDD) principles. The following cycle must be considered:
1. Red: Write a failing test that describes the desired behavior. This test should fail initially because there’s no implementation yet.
2. Green: Write the minimum code necessary to make the test pass. The goal is to make the test green as quickly as possible.
3. Refactor: Once the test passes, refactor the code to improve its design, readability, and maintainability. The tests act as a safety net to catch any regressions during refactoring.

### Standardization

- Naming conventions
- Testing standards

### Tests must be deterministic

- Avoid randomization or be careful about randomness
- Avoid side effects

### Save time automating

- Use `@RepeatedTest` to run a test multiple times
- Use `@ParameterizedTest` to run a test with multiple parameters
- Use `@ValueSource` to run a test with multiple parameters from a list of values
- Use `@EnumSource` to run a test with multiple parameters from an enum
- Use `@CsvSource` to run a test with multiple parameters from a CSV format
- Use `@CsvFileSource` to run a test with multiple parameters from a CSV file
- Use `@MethodSource` to run a test with multiple parameters from a method
- Use `@Nested` to run a test inside another test
- Use `@ExtendWith` to run a test with an extension
- Use code coverage tools to analyze code coverage (Jacoco)
- Automate test execution
- Maven have plugins to run automated tests (Maven Surefire?)

## F.I.R.S.T. principles

First principles of testing stand for

- Fast
- Isolated/Independent
- Repeatable
- Self-validating
- Through

Bugs are introduced in the parts of code, which we usually don’t pay attention to, or places which are too hard to understand.

**Fast**

The developer shouldn’t hesitate to run the unit tests at any point of their development cycle, even if there are thousands of unit tests. They should run and show you the desired output in a matter of seconds

**Isolated**

- For any given unit test, for its environment variables or for its setup. It should be independent of everything else should so that it results is not influenced by any other factor.
- Should follow the 3 A’s of testing: Arrange, Act, Assert
- In some literature, it’s also called as Given, when, then.

_Arrange_

All the data should be provided to the test when you’re about to run the test and it should not depend on the environment you are running the tests

_Act_

Invoke the actual method under test

_Assert_

At any given point, a unit test should only assert one logical outcome, multiple physical asserts can be part of this physical assert, as long as they all act on the state of the same object.

Preferably, don’t do any actions after the assert call

**Repeatable**

- Tests should be repeatable and deterministic, their values shouldn’t change based on being run on different environments.
- Each test should set up its own data and should not depend on any external factors to run its test

**Self-validating**

- you shouldn’t need to check manually, whether the test passed or not.

**Thorough**

- should cover all the happy paths
- try covering all the edge cases, where the author would feel the function would fail.
- test for illegal arguments and variables.
- test for security and other issues
- test for large values, what would a large input do their program.
- should try to cover every use case scenario and not just aim for 100% code coverage.

## Reference

https://junit.org/junit5/docs/current/user-guide/
https://junit.org/junit5/
https://github.com/junit-team/junit5/
https://www.baeldung.com/junit-5-gradle
https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html

### Assertions

https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html
https://www.tutorialspoint.com/junit/junit_using_assertion.htm

### Before, BeforeAll, BeforeEach, After, AfterAll, etc

https://www.baeldung.com/junit-before-beforeclass-beforeeach-beforeall

### Assumptions

https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assumptions.html
https://www.baeldung.com/junit-5#2-assumptions
https://mkyong.com/junit5/junit-5-assumptions-examples/
https://junit.org/junit5/docs/current/user-guide/#writing-tests-conditional-execution

### Tests execution order

https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-execution-order

### Test instance lifecycle

https://junit.org/junit5/docs/current/user-guide/#writing-tests-test-instance-lifecycle

### Parameterized tests

https://junit.org/junit5/docs/current/user-guide/#writing-tests-parameterized-tests

### Testing with JetBrains IntelliJ IDEA

https://www.jetbrains.com/help/idea/tests-in-ide.html

### Testing with Eclipse IDE

https://wiki.eclipse.org/Eclipse/Testing
https://nglauber.medium.com/junit-no-eclipse-ebd134fcf6d4
https://edisciplinas.usp.br/pluginfile.php/5768433/mod_resource/content/0/Utilizando%20JUnit%20no%20Eclipse.pdf

### Testing with VSCode

https://code.visualstudio.com/docs/java/java-testing

### Best Practices

https://www.testim.io/blog/unit-testing-best-practices/
https://devporai.com.br/5-dicas-para-escrever-bons-testes-unitarios/
https://jeziellago.medium.com/testes-boas-pr%C3%A1ticas-e-patterns-6bfe0925040

### F.I.R.S.T principles

https://medium.com/@tasdikrahman/f-i-r-s-t-principles-of-testing-1a497acda8d6
https://github.com/ghsukumar/SFDC_Best_Practices/wiki/F.I.R.S.T-Principles-of-Unit-Testing
https://martinfowler.com/bliki/GivenWhenThen.html
https://xp123.com/articles/3a-arrange-act-assert/
