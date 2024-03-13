package com.example.tut.collections.LinkedHashMap;

import java.util.LinkedHashMap;

public class Lesson {

    public static void main(String[] args) {
        // Creating a LinkedHashMap to keep track of items with order of insertion.
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

        // Inserting some entries into the map.
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        // Displaying the content and the order in which elements were inserted.
        System.out.println("LinkedHashMap content: " + map);

        // Accessing one of the inserted elements.
        System.out.println("Value associated with key 'Two': " + map.get("Two"));

        // Demonstrating ordered iteration over keys.
        System.out.println("Iteration over keys and their values: ");
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

        // Removing an item from the map and showing the map content afterwards.
        map.remove("Three");
        System.out.println("After removing key 'Three': " + map.toString());

        // Demonstrating the insertion-order is not affected by access order.
        map.get("One");
        System.out.println("Accessing 'One' does not change the order: " + map.toString());
    }
}