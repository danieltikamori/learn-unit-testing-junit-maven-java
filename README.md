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

### Testing

Right click anywhere in the class Person and select Generate..., then select Test.
Select the methods you want to test. It will generate a test class inside the test directory.

You may also create your own test inside this new class as in this example code.

After creating your test, run the test class.

## Reference

https://junit.org/junit5/
https://github.com/junit-team/junit5/
https://www.baeldung.com/junit-5-gradle
https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html


