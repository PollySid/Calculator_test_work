package com.company;

public class RomanToArabic {
    public static int getArabic(String a) {
        int result = 0;
        for (int i = 0; i < a.length(); i++) {
            char s1 = a.charAt(i);
            char s2 = 0;
            switch (s1) {
                case 'I':
                    if (i + 1 < a.length()) {
                        s2 = a.charAt(i + 1);
                        switch (s2) {
                            case 'V' -> {
                                result += 4;
                                i += 1;
                            }
                            case 'X' -> {
                                result += 9;
                                i += 1;
                            }
                            default -> result += 1;
                        }
                    } else
                        result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                default: throw new ArithmeticException("Numbers are not allowed");
            }
        }
        return result;
    }
}
