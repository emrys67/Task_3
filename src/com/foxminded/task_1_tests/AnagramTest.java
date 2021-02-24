package com.foxminded.task_1_tests;

import com.foxminded.task_1.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private Anagram anagram;
    private static final String NULL_MESSAGE_EXPECT = "Null input in Anagram.getAnagram()";
    private static final String EMPTY_SPACE = "";
    private static final String EMPTY_SPACE_REVERSE = "";
    private static final String ONLY_LETTERS = "abcd";
    private static final String ONLY_LETTERS_REVERSE = "dcba";
    private static final String ONLY_DIGITS = "1234";
    private static final String ONLY_DIGITS_REVERSE = "1234";
    private static final String LETTERS_AND_DIGITS = "a1bcd";
    private static final String LETTERS_AND_DIGITS_REVERSE = "d1cba";
    private static final String ONLY_SPECIAL_SYMBOLS = "!@#$";
    private static final String ONLY_SPECIAL_SYMBOLS_REVERSE = "!@#$";
    private static final String DIGITS_AND_SPECIAL_SYMBOLS = "1!2@3#4$";
    private static final String DIGITS_AND_SPECIAL_SYMBOLS_REVERSE = "1!2@3#4$";
    private static final String LETTERS_AND_SPECIAL_SYMBOLS = "a!b@c#d$";
    private static final String LETTERS_AND_SPECIAL_SYMBOLS_REVERSE = "d!c@b#a$";
    private static final String DIGITS_LETTERS_AND_SPECIAL_SYMBOLS = "a!1b2@c#3d$";
    private static final String DIGITS_LETTERS_AND_SPECIAL_SYMBOLS_REVERSE = "d!1c2@b#3a$";

    @BeforeEach
    void setUp(){
        anagram = new Anagram();
    }

    @Test
    void getAnagramNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, ()->{
            anagram.getAnagram(null);
        });
        String actual = exception.getMessage();
        assertTrue(actual.contains(NULL_MESSAGE_EXPECT));

    }

    @Test
    void getAnagramEmpty() {
        assertEquals(EMPTY_SPACE_REVERSE, anagram.getAnagram(EMPTY_SPACE));
    }

    @Test
    void getAnagramDigits() {
        assertEquals(ONLY_DIGITS_REVERSE, anagram.getAnagram(ONLY_DIGITS));
    }

    @Test
    void getAnagramSymbols() {
        assertEquals(ONLY_SPECIAL_SYMBOLS_REVERSE, anagram.getAnagram(ONLY_SPECIAL_SYMBOLS));
    }

    @Test
    void getAnagramLetters() {
        assertEquals(ONLY_LETTERS_REVERSE, anagram.getAnagram(ONLY_LETTERS));
    }

    @Test
    void getAnagramLettersAndDigits() {
        assertEquals(LETTERS_AND_DIGITS_REVERSE, anagram.getAnagram(LETTERS_AND_DIGITS));
    }

    @Test
    void getAnagramSymbolsAndLetters() {
        assertEquals(LETTERS_AND_SPECIAL_SYMBOLS_REVERSE, anagram.getAnagram(LETTERS_AND_SPECIAL_SYMBOLS));
    }

    @Test
    void getAnagramSymbolsAndDigits() {
        assertEquals(DIGITS_AND_SPECIAL_SYMBOLS_REVERSE, anagram.getAnagram(DIGITS_AND_SPECIAL_SYMBOLS));
    }

    @Test
    void getAnagramSpecialSymbols() {
        assertEquals(ONLY_SPECIAL_SYMBOLS_REVERSE, anagram.getAnagram(ONLY_SPECIAL_SYMBOLS));
    }

    @Test
    void getAnagramLettersSymbolsAndDigits() {
        assertEquals(DIGITS_LETTERS_AND_SPECIAL_SYMBOLS_REVERSE, anagram.getAnagram(DIGITS_LETTERS_AND_SPECIAL_SYMBOLS));
    }
}