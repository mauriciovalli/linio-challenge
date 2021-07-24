/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.action;

import org.springframework.stereotype.Component;

@Component
public class NumberAction {

    private static final String[] STRING_VALUES = {"Linio", "IT",  "Linianos"};
    private static final int NUMBER1 = 3;
    private static final int NUMBER2 = 5;
    private static final int MULTIPLE_BOTH = NUMBER1 * NUMBER2;

    // return 1 if true or 0 if false
    private int boolToInt(boolean b) {
        return Boolean.compare(b, false);
    }

    // return number to string
    public String toString(int number) {
        // if number is multiple of number1 or number2
        if (number % NUMBER1 == 0 || number % NUMBER2 == 0) {
            // if number is multiple of number1 and not of number2 -> position 0
            // if number is multiple of number2 and not of number1 -> position 1
            // if number is multiple of number1 and number2 -> position 2
            return STRING_VALUES[boolToInt(number % NUMBER2 == 0 && number % NUMBER1 >= 1) + boolToInt(number % MULTIPLE_BOTH == 0) * 2];
        }
        return String.valueOf(number);
    }
}
