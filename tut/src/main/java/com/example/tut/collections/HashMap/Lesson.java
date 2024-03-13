package com.example.tut.collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Lesson {
    public static void main(String[] args) {
        // Initialize a HashMap named basket
        HashMap<String, Integer> basket = new HashMap<>();

        // Adding elements to the HashMap
        basket.put("Apple", 3);
        basket.put("Orange", 2);
        basket.put("Banana", 5);

        // Access elements
        System.out.println("Apples in Basket: " + basket.get("Apple"));

        // Check if a key exists in the HashMap
        if (basket.containsKey("Apple")) {
            System.out.println("Apples are in the basket");
        }

        basket.merge("Apple", 3, Integer::sum); //merge map value if it exists it will use the last param :Bifunction ele it will give it the second param value.
        // Check if a value exists in the HashMap
        if (basket.containsValue(2)) {
            System.out.println("There are fruits with quantity 2 in the basket");
        }

        // Remove an element from the HashMap
        basket.remove("Orange");
        System.out.println("After removing Oranges: " + basket);

        // Iterating over HashMap
        System.out.println("Basket contains:");
        for (Map.Entry<String, Integer> entry : basket.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Finding the size of the HashMap
        System.out.println("The basket contains " + basket.size() + " types of fruits.");

        // Clearing the HashMap
        basket.clear();
        System.out.println("After clearing, basket is " + basket);
    }
}