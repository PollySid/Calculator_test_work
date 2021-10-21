package com.company;

public class Calc {

    public int getResult(int a, int b, String c) {

        return switch (c) {
            case "*" -> a * b;
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            default -> throw new ArithmeticException("Operation does not recognised");
        };
    }
}
