/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.genericsexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gavan
 */
public class GenericsExample {

    // Using generics with a method
    private static <T, V> T shout(T value1, V value2) {
        System.out.println(value1 + "!!!!");
        return value1;
    }

    private static void printList(List<?> myList) {
        System.out.println();
    }

    public static void main(String[] args) {

        Printer<Cat> intPrinter = new Printer(new Cat());
        intPrinter.print();

        Printer<Dog> doublePrinter = new Printer(new Dog());
        doublePrinter.print();

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat());

        // Retrieving the Cat from the list
        Cat myCat = (Cat) cats.get(0); // Object can't be converted to Cat

        shout("Hello", "Goodbye");
        shout(new Cat(), "Meow");
        shout(Math.PI, "Yum, pie!");

        var val = shout("Hello", "Goodbye");
        System.out.println("Val is a " + val.getClass().getSimpleName());

        // New List
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
    }
}
