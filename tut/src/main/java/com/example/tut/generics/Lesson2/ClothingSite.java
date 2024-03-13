package com.example.tut.generics.Lesson2;

import java.util.ArrayList;
import java.util.List;

public class ClothingSite {

    public static void main(String[] args) {
        JacketItem  item = new JacketItem();
        ShirtItem  item2 = new ShirtItem();
     //   checkoutItem(item);
         List<ShirtItem> items = new ArrayList<>(List.of(item2));
         List<JacketItem> items2 = new ArrayList<>(List.of(item));
        
         checkoutItems(items);      
         checkoutItems(items2);
    }


    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }


    static void checkoutItems(List<? extends ClothingItem> items) {
        items.forEach(
        item-> checkoutItem(item)
        );

    }



}


