/*
 * Copyright (c) 2024 Daniel I. Tikamori. All rights reserved.
 */

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

// Define a class named Person
public class Person {

    // Declare private fields for the person's name and date of birth
    private String name;
    private LocalDateTime dateOfBirth;

    // Constructor for the Person class that takes in a name and date of birth
    public Person(String name, LocalDateTime dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to calculate and return the age of the person
    public int getAge(){
        return (int) ChronoUnit.YEARS.between(dateOfBirth, LocalDateTime.now());
    }

    // Method to check if the person is an adult (age 18 or older)
    public boolean isAdult(){
        return getAge() >= 18;
    }

    // Override the equals method to compare if two Person objects are equal
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // If the objects are the same, they are equal
        if (obj == null || getClass() != obj.getClass()) return false; // If the object is null or not of the same class, they are not equal
        Person person = (Person) obj; // Cast the object to a Person
        return name.equals(person.name) && Objects.equals(dateOfBirth, person.dateOfBirth); // Check if the names are equal and the date of births are equal
    }

    // Override the hashCode method to generate a hash code based on the person's name and date of birth
    @Override
    public int hashCode(){
        return Objects.hash(name, dateOfBirth);
    }
}