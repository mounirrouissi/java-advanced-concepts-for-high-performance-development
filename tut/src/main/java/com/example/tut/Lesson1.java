package com.example.tut;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lesson1 {
    public static void main(String[] args) {
        List<String> lines = List.of("a","b","c");

        List<Integer> numbers = List.of(1,2,3);

        System.out.println(printList(lines));
        // printList(numbers);
    }

    public static <T> Map<Character, ?> printList(List<? extends String> list) {
  return list.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
}
}