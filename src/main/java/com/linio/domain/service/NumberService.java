/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.domain.service;

import com.linio.domain.dto.ListDto;

public interface NumberService {
    String printNumber(int number);
    ListDto<String> printAllNumbers();
}
