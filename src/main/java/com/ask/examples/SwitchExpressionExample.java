package com.ask.examples;

public class SwitchExpressionExample {

    public static void main(String[] args) {
        int statusCode = 200;

        //Before Java 14
        String status = null;
        switch (statusCode) {
            case 200, 201, 204:
                status = "SUCCESS";
                break;
            case 400, 500:
                status = "FAILURE";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + statusCode);
        }
        System.out.println(status);

        statusCode = 400;
        //After java 14
        status = switch (statusCode) {
            case 200, 201, 204 -> "SUCCESS";
            case 400, 500 -> "FAILURE";
            default -> throw new IllegalStateException("Unexpected value: " + statusCode);
        };

        System.out.println(status);
    }
}
