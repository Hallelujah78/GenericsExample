/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.genericsexample;

import java.util.ArrayList;

/**
 *
 * @author gavan
 */
public class GenericsExample {

    public static void main(String[] args) {

        Printer<Cat> intPrinter = new Printer(new Cat());
        intPrinter.print();

        Printer<Dog> doublePrinter = new Printer(new Dog());
        doublePrinter.print();

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat());

        // Retrieving the Cat from the list
        Cat myCat = (Cat) cats.get(0); // Object can't be converted to Cat

    }
}
