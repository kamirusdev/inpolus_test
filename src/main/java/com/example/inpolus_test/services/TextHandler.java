package com.example.inpolus_test.services;

public class TextHandler {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    public static int countMatches(String text, String str) {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }
        int index = 0, count = 0;
        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                count++;
                index += str.length();
            } else {
                break;
            }
        }
        return count;
    }
}
