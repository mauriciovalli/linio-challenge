/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linio.domain.action.NumberAction;
import com.linio.domain.dto.ListDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberServiceTest {
    private static final String EXPECTEED_JSON = "{\"content\":[\"1\",\"2\",\"Linio\",\"4\",\"IT\",\"Linio\",\"7\",\"8\",\"Linio\",\"IT\",\"11\",\"Linio\",\"13\",\"14\",\"Linianos\",\"16\",\"17\",\"Linio\",\"19\",\"IT\",\"Linio\",\"22\",\"23\",\"Linio\",\"IT\",\"26\",\"Linio\",\"28\",\"29\",\"Linianos\",\"31\",\"32\",\"Linio\",\"34\",\"IT\",\"Linio\",\"37\",\"38\",\"Linio\",\"IT\",\"41\",\"Linio\",\"43\",\"44\",\"Linianos\",\"46\",\"47\",\"Linio\",\"49\",\"IT\",\"Linio\",\"52\",\"53\",\"Linio\",\"IT\",\"56\",\"Linio\",\"58\",\"59\",\"Linianos\",\"61\",\"62\",\"Linio\",\"64\",\"IT\",\"Linio\",\"67\",\"68\",\"Linio\",\"IT\",\"71\",\"Linio\",\"73\",\"74\",\"Linianos\",\"76\",\"77\",\"Linio\",\"79\",\"IT\",\"Linio\",\"82\",\"83\",\"Linio\",\"IT\",\"86\",\"Linio\",\"88\",\"89\",\"Linianos\",\"91\",\"92\",\"Linio\",\"94\",\"IT\",\"Linio\",\"97\",\"98\",\"Linio\",\"IT\"]}";
    private final NumberAction myAction = new NumberAction();
    private final NumberService myService = new NumberServiceImpl(myAction);

    private static String mapToJson(Object obj) throws JsonProcessingException {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

    @Test
    void testPrintAllNumbers() throws JsonProcessingException {
        final ListDto<String> result = myService.printAllNumbers();
        assertEquals(EXPECTEED_JSON, mapToJson(result));
    }

    @SuppressWarnings("ConstantConditions")
    @Test
    void testPrintNumber() {
        final String expectedLinio = "Linio";
        final String expectedIT = "IT";
        final String expectedLinianos = "Linianos";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                assertEquals(expectedLinio, myService.printNumber(i));
            } else if (i % 5 == 0 && i % 3 != 0) {
                assertEquals(expectedIT, myAction.toString(i));
            } else if (i % 3 == 0 && i % 5 == 0) {
                assertEquals(expectedLinianos, myAction.toString(i));
            } else {
                assertEquals(String.valueOf(i), myAction.toString(i));
            }
        }
    }
}
