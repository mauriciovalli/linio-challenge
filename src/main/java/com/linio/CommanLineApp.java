/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio;

import com.linio.domain.action.NumberAction;
import com.linio.domain.dto.ListDto;
import com.linio.domain.service.NumberService;
import com.linio.domain.service.NumberServiceImpl;

public class CommanLineApp {
    private CommanLineApp() {
    }

    public static void main(String[] args) {
        final NumberAction myAction = new NumberAction();
        final NumberService myService = new NumberServiceImpl(myAction);
        final ListDto<String> result = myService.printAllNumbers();
        result.getContent().forEach(System.out::println);
    }
}
