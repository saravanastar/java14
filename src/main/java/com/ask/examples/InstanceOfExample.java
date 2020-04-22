package com.ask.examples;

/**
 * Pattern Matching Instance of.
 */
public class InstanceOfExample {
    public static void main(String[] args) {
        Object input = 12;

        //before Java 14.
        if (input instanceof Integer) {
            Integer number = (Integer) input;
            System.out.println(number);
        }

        //After Java 14.
        if (input instanceof Integer number) {
            System.out.println(number);
        }
    }
}
