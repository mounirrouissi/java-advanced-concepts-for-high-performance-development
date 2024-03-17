package com.example.tut;

import java.util.function.Consumer;
import java.util.function.Function;
package com.example.tut;

import java.util.function.Consumer;
import java.util.function.Function;

package com.example.tut;


import java.util.function.Predicate;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // Print a simple greeting to the console
        System.out.println("Hello world!");

        // Initialize a Consumer functional interface to consume a String and print it
        Consumer<String> greeting = (String s) -> System.out.println("Greeting: " + s);
        // Use the accept() method of the Consumer interface to print a greeting
        greeting.accept("HI");

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

    }
}