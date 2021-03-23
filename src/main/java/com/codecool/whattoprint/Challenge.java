package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        String res = "";
        if (number == 0 || words.length < 2) {
            return res;
        }

        if (number % 7 == 0 && number % 3 == 0) {
            res = words[0] + words[1];
        } else if (number % 7 == 0) {
            res = words[1];
        } else if (number % 3 == 0) {
            res = words[0];
        }
        return res;
    }
}
