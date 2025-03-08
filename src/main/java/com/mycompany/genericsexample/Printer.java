/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericsexample;

import java.util.List;

/**
 *
 * @author gavan
 * @param <T> The type of value the Printer will store and print.
 *
 */
public class Printer<T extends Animal & List> {

    T value;

    /**
     * Default constructor.
     */
    public Printer() {
        super();
    }

    /**
     * Constructor for IntegerPrinter. Takes a value and returns an instance of
     * IntegerPrinter.
     *
     * @param value The value to be stored in the instance.
     */
    public Printer(T value) {
        super();
        this.value = value;
    }

    /**
     *
     */
    public void print() {
        System.out.println(value);

    }

}
