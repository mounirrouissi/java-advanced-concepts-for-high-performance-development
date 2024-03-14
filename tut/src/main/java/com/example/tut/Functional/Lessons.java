package com.example.tut.Functional;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.List;
import java.util.stream.Collectors;

public class Lessons {
    public static void main(String[] args) {
        {
        // Print a simple greeting to the console
        System.out.println("Hello world!");
        // Initialize a Consumer functional interface to consume a String and print it
        Consumer<String> greeting = (String s) -> System.out.println("Greeting: " + s);
        // Use the accept() method of the Consumer interface to print a greeting
        greeting.accept("HI");

        // Example of a Supplier functional interface that returns a greeting string
        Supplier<String> greetingSupplier = () -> "Hello from Supplier!";
        // Use the get() method of the Supplier interface to get the greeting string
        System.out.println(greetingSupplier.get());
        // Initialize a Function functional interface to transform a String to its uppercase version
        Function<String, String> toUpperCase = (String s) -> s.toUpperCase();
        // Apply the function to a string and print the result
        System.out.println(toUpperCase.apply("hello, functional programming"));

        // Initialize a Predicate functional interface to test if a String is empty
        Predicate<String> isEmpty = (String s) -> s.isEmpty();
        // Use the test() method of the Predicate interface to check if a string is empty
        System.out.println("Is string empty: " + isEmpty.test(""));

        // Initialize a BiFunction functional interface to concatenate two Strings
        BiFunction<String, String, String> concatenate = (String s1, String s2) -> s1 + s2;
        // Apply the BiFunction to two strings and print the result
        System.out.println(concatenate.apply("Hello, ", "functional programming"));

        // Initialize a list of strings for demonstration of Stream API
        List<String> names = List.of("Alice", "Bob", "Charlie", "Daisy");

        // Use the stream() method and the map() intermediary operation to convert each name to uppercase
        // Then, use the forEach() terminal operation to print each name
        names.stream()
             .map(toUpperCase) // Reuse the Function defined earlier
             .forEach(System.out::println);

        // Filter names that start with 'C' using the filter() intermediary operation
        // Collect the result into a new List
        List<String> namesStartingWithC = names.stream()
                                               .filter(name -> name.startsWith("C"))
                                               .collect(Collectors.toList());

        // Print the names starting with 'C'
        System.out.println("Names starting with 'C': " + namesStartingWithC);
    }
    }
}