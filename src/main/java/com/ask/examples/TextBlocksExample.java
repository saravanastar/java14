package com.ask.examples;

/**
 * Text blocks preview.
 */
public class TextBlocksExample {

    public static void main(String[] args) {

        //Before java 14
        String utterences = "User is interacting " +
                "with the " +
                "customer";
        System.out.println(utterences);


        //After java 14
        utterences = """
                User is interacting with the customer.
                cool
                bye
                """;

        System.out.println(utterences);

    }
}
