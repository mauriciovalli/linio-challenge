/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.action;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberActionTest {
    private final
    NumberAction myAction = new NumberAction();

    @Test
    void testIT() {
        final String expected = "IT";

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }

//        assertEquals(expected, myAction.toString(5));
//        assertEquals(expected, myAction.toString(10));
//        assertEquals(expected, myAction.toString(20));
//        assertEquals(expected, myAction.toString(25));
//        assertEquals(expected, myAction.toString(35));
//        assertEquals(expected, myAction.toString(40));
//        assertEquals(expected, myAction.toString(50));
//        assertEquals(expected, myAction.toString(55));
    }

    @Test
    void testLinianos() {
        final String expected = "Linianos";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }


//        assertEquals(expected, myAction.toString(15));
//        assertEquals(expected, myAction.toString(30));
//        assertEquals(expected, myAction.toString(45));
//        assertEquals(expected, myAction.toString(60));
//        assertEquals(expected, myAction.toString(75));
//        assertEquals(expected, myAction.toString(90));
    }

    @Test
    void testLinio() {
        final String expected = "Linio";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }
//        assertEquals(expected, myAction.toString(3));
//        assertEquals(expected, myAction.toString(6));
//        assertEquals(expected, myAction.toString(9));
//        assertEquals(expected, myAction.toString(12));
//        assertEquals(expected, myAction.toString(18));
    }
}