package com.example.tut.collections.LinkedList;

import java.util.LinkedList;

public class Lesson1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");
        list.add("b");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list.poll());   //remove first item but dosnt throw exception when elemnt is null
        System.out.println(list.pop());   //remove first item but throws exception when elemnt is null
        System.out.println(list);
    }
    
}
