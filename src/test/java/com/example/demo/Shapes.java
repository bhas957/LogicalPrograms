package com.example.demo;

public class Shapes {
    public static void main(String[] args) {
        diamondStarPattern(3);
    }

    /*
    input 3
    Output      *
               * *
              * * *
               * *
                *
     */
    public static void diamondStarPattern(int num) {
        int i = findLengthofPattern(num);
        for (int k = 1; k <= i; k++) {
            if (k > num) System.out.println(printShape(k - num, i, "*"));
            else System.out.println(printShape(k, i, "*"));
        }
    }

    public static String printShape(int number, int maxLength, String patternshape) {
        String pattern = "";
        for (int i = 1; i <= number; i++) {
            pattern = " " + patternshape + " ";
        }
        int adjustLen = (maxLength - pattern.length()) / 2;
        for (int i = 0; i < adjustLen; i++) pattern = " " + patternshape + " ";

        System.out.println(pattern);
        return pattern;
    }

    public static int findLengthofPattern(int num) {
        return 2 * num + 1;
    }
}
