package com.foxminded.task_1_tests;

import com.foxminded.task_1.Anagram;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

private Anagram anagram;

    @BeforeEach
    void setUp() throws Exception{
        anagram = new Anagram();
    }


    @Test
    void reverseWord(){
        String actual = anagram.reverseWord("a1bcd");
        assertEquals("d1cba", actual);
    }

    @Test
    void getAnagram() {
        String actual = anagram.getAnagram("a1bcd efg!h");
        assertEquals("d1cba hgf!e", actual);
    }
}