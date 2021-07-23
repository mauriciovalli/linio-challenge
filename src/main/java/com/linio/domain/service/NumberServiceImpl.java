/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.service;

import com.linio.domain.action.NumberAction;
import com.linio.domain.dto.ListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberServiceImpl implements NumberService {

    private final
    NumberAction myAction;

    @Autowired
    public NumberServiceImpl(NumberAction myAction) {
        this.myAction = myAction;
    }

    @Override
    public String printNumber(int number) {
        return myAction.toString(number);
    }

    @Override
    public ListDto<String> printAllNumbers() {
        final ListDto<String> listDto = new ListDto<>();
        for (int number = 1; number <= 100; number++) {
            listDto.add(myAction.toString(number));
        }
        return listDto;
    }
}
