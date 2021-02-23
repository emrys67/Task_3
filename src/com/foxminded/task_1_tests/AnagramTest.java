package com.foxminded.task_1_tests;

import com.foxminded.task_1.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

private Anagram anagram;

    @BeforeEach
    void setUp(){
        anagram = new Anagram();
    }
    @Test
    void getAnagramGeneral() {
        String actual = anagram.getAnagram("a1bcd efg!h");
        assertEquals("d1cba hgf!e", actual);
    }
    @Test
    void getAnagramNull() {
        String actual = anagram.getAnagram("a1bcd efg!h");
        assertEquals((Byte) null, null);
    }
    @Test
    void getAnagramEmpty() {
        String actual = anagram.getAnagram("a1bcd efg!h");
        assertEquals("", "");
    }
    @Test
    void getAnagramDigits() {
        String actual = anagram.getAnagram("12345");
        assertEquals("12345", actual);
    }
    @Test
    void getAnagramSimbols() {
        String actual = anagram.getAnagram("abcd");
        assertEquals("dcba", actual);
    }
}