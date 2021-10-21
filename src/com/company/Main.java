package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String [] tokens = input.split(" ");
        int a = 0;
        int b = 0;

        boolean isRoman1 = tokens[0].contains("I") || tokens[0].contains("V") || tokens[0].contains("X");
        boolean isRoman2 = tokens[2].contains("I") || tokens[2].contains("V") || tokens[2].contains("X");
        if (isRoman1 != isRoman2)
            throw new ArithmeticException("Numbers are in different number systems");
        else if (isRoman1) {
                a = RomanToArabic.getArabic(tokens[0]);
                b = RomanToArabic.getArabic(tokens[2]);
            }
            else {
                a = Integer.parseInt(tokens[0]);
                b = Integer.parseInt(tokens[2]);
            }
        if (a > 10 || b > 10 || a < 1 || b < 1)
            throw new ArithmeticException("Numbers are not allowed");

        Calc result = new Calc();
        int output = result.getResult(a, b, tokens[1]);

        String outputString = Integer.toString(output);
        if (isRoman1)
            if (output < 1)
                throw new ArithmeticException("Result is incorrect");
            else
                outputString = ArabicToRoman.getRoman(output);

        System.out.println(outputString);
    }
}
