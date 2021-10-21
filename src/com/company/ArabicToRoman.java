package com.company;

public class ArabicToRoman {
    public static String getRoman(int a) {
        StringBuilder result = new StringBuilder();
        String work = Integer.toString(a);
        for (int i = 0; i < work.length(); i++) {
            char s1 = work.charAt(i);
            switch (s1) {
                case '1':
                    if (i + 1 < work.length())
                        switch (work.length()) {
                            case 2 -> result.append('X');
                            case 3 -> result.append('C');
                    }
                    else
                        result.append('I');
                    break;
                case '2':
                    if (i + 1 < work.length())
                        result.append("XX");
                    else
                        result.append("II");
                    break;
                case '3':
                    if (i + 1 < work.length())
                        result.append("XXX");
                    else
                        result.append("III");
                    break;
                case '4':if (i + 1 < work.length())
                    result.append("XL");
                else
                    result.append("IV");
                    break;
                case '5':if (i + 1 < work.length())
                    result.append('L');
                else
                    result.append('V');
                    break;
                case '6':if (i + 1 < work.length())
                    result.append("LX");
                else
                    result.append("VI");
                    break;
                case '7':if (i + 1 < work.length())
                    result.append("LXX");
                else
                    result.append("VII");
                    break;
                case '8':if (i + 1 < work.length())
                    result.append("LXXX");
                else
                    result.append("VIII");
                    break;
                case '9':if (i + 1 < work.length())
                    result.append("XC");
                else
                    result.append("IX");
                    break;
                default:
            }
        }
        return result.toString();
    }
}
