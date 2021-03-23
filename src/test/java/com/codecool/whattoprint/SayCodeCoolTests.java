package com.codecool.whattoprint;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import cccr.CCCRTestExecutionListener;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith({CCCRTestExecutionListener.class})
public class SayCodeCoolTests {
    private final static String[] words = new String[]{"Code", "Cool", "Apple"};

    @Test
    public void testCode() {
        assertEquals("Code", Challenge.decideAndSay(words, 3));
    }

    @Test
    public void testCool() {
        assertEquals("Cool", Challenge.decideAndSay(words, 7));
    }

    @Test
    public void testCodeCool() {
        assertEquals("CodeCool", Challenge.decideAndSay(words, 21));
    }

    @Test
    public void testEmpthyString() {
        assertEquals("", Challenge.decideAndSay(words, 10));
    }

    @Test
    public void testNegative() {
        assertEquals("Cool", Challenge.decideAndSay(words, -7));
    }
}