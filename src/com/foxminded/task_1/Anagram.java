package com.foxminded.task_1;

import java.util.StringJoiner;

public class Anagram {
    private static final String SPACE = " ";

    public String getAnagram(String input){
        if(input == null){
            throw new IllegalArgumentException("Null input in Anagram.getAnagram()");
        }
        String inputArray[] = input.split(SPACE);
        StringJoiner output = new StringJoiner(SPACE);
        for(int a = 0; a < inputArray.length;a++) {

            output.add(reverseWord(inputArray[a]));
        }
        return output.toString();
    }

    private String reverseWord(String input){
        int count = 0;
        char chars[] = new char[input.length()];
        char charsOut[] = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                chars[count] = input.charAt(i);
                count++;
            }
        }
        count--;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isAlphabetic(input.charAt(i))) {
                charsOut[i] = chars[count];
                count--;
            }
            else
                charsOut[i] = input.charAt(i);
        }
        return new String(charsOut);
    }
}
