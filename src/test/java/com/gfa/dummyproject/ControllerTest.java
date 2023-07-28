package com.gfa.dummyproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ControllerTest {
    /**
     * Method under test: {@link Controller#home()}
     */
    @Test
 void testHome() {
        assertEquals("This is the best thing on the internet for today, sorry:(", (new Controller()).home());
    }
}

