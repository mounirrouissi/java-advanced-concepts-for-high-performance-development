package com.example.tut.generics.Lesson2;

public class ShirtItem extends ClothingItem {

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
}
