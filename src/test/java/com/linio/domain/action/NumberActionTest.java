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
    private static final int NUMBER1 = 3;
    private static final int NUMBER2 = 5;
    private final
    NumberAction myAction = new NumberAction();

    @Test
    void testIT() {
        final String expected = "IT";

        for (int i = 1; i <= 100; i++) {
            if (i % NUMBER2 == 0 && i % NUMBER1 != 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }
    }

    @Test
    void testLinianos() {
        final String expected = "Linianos";

        for (int i = 1; i <= 100; i++) {
            if (i % NUMBER1 == 0 && i % NUMBER2 == 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }
    }

    @Test
    void testLinio() {
        final String expected = "Linio";

        for (int i = 1; i <= 100; i++) {
            if (i % NUMBER1 == 0 && i % NUMBER2 != 0) {
                // Assert the response
                assertEquals(expected, myAction.toString(i));
            }
        }
    }

    @Test
    void testNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % NUMBER1 != 0 && i % NUMBER2 != 0) {
                // Assert the response
                assertEquals(String.valueOf(i), myAction.toString(i));
            }
        }
    }
}