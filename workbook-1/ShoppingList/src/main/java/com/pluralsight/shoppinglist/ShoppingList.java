package com.pluralsight.shoppinglist;

public class ShoppingList {
    public static void main(String[] arg) {
        String[] shoppingList = {"Eggs", "Milk", "Butter", "Soup", "Soap",
                "Candy", "Water", "Juice", "Shampoo"};
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }
}
// You should choose "Add local interpreter >> Virtualenv >> Existing"