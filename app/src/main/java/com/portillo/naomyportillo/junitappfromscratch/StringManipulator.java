package com.portillo.naomyportillo.junitappfromscratch;

import java.util.Arrays;
import java.util.HashSet;

public class StringManipulator {

    private static StringManipulator instance;

    private StringManipulator() {

    }

    public static StringManipulator getInstance() {
        if (instance == null) {
            instance = new StringManipulator();
        }
        return instance;
    }

    boolean isLessThan10(String input) {
        if (input == null) {
            input = "";
        }
        return input.length() < 10;
    }

    boolean isOddLength(String input) {
        if (input == null) {
            input = "";
        }
        return input.length() % 2 == 1;
    }

    public String zipperWords(String first, String second) {

        StringBuilder zipper = new StringBuilder();
        String remainder = "";

        if (second.length() < first.length()) {
            remainder = first.substring(second.length());
            for (int i = 0; i < second.length(); i++) {
                zipper.append(String.valueOf(first.charAt(i)))
                        .append(String.valueOf(second.charAt(i)));
            }
        }
        if (second.length() > first.length()) {
            remainder = second.substring(first.length());
            for (int i = 0; i < first.length(); i++) {
                zipper.append(String.valueOf(first.charAt(i)))
                        .append(String.valueOf(second.charAt(i)));
            }
        }
        return zipper.toString() + remainder;
    }


    public String deconstructedWord(String word) {
        StringBuilder nonVowels = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        HashSet<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');

        for (int i = 0; i < word.length(); i++) {
            if (vowelSet.contains(word.charAt(i))) {
                vowels.append(word.charAt(i));
            }
            if (!vowelSet.contains(word.charAt(i))) {
                nonVowels.append(word.charAt(i));
            }
        }
        return nonVowels.toString() + " " + vowels.toString();
    }

    public int wordSum(String first, String second) {
        return first.length() + second.length();
    }

    public String longestWord(String[] words) {

        String longest = "";
        int currentLength = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > currentLength) {
                currentLength =  words[i].length();
                longest = words[i];
            }
        }
        return longest;
    }

    public String[] wordSort(String[] words) {


        String temp = "";
        int tmpI = 0;

        String sorted[] = new String[words.length];

        for (int j = 0; j < words.length -1 ; j++) {

            for (int i = 0; i < words.length-1; i++) {
                if (tmpI > words[i + 1].length()) {
                    tmpI = words[i].length();
                    temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    sorted = words;

                }
            }
        }
        return sorted;
    }


    public static void main(String[] args) {

        StringManipulator stringManipulator = StringManipulator.getInstance();

        String first = "cake";
        String second = "cookies";
        String[] arr = { "cheesecake","candy","cake", "cookie"};
//        System.out.println(stringManipulator.zipperWords(second, first));
        //  System.out.println(stringManipulator.deconstructedWord(second));

//        System.out.println(stringManipulator.longestWord(arr));

        System.out.println(Arrays.toString(stringManipulator.wordSort(arr)));

    }
}
