/*
 * (C) Copyright  2011/2021 BPMX.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF BPMX.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.application.rest;

import com.linio.domain.dto.ListDto;
import com.linio.domain.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class NumberRestController {

    private final NumberService myService;

    @Autowired
    public NumberRestController(NumberService myService) {
        this.myService = myService;
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ListDto<String> printAllNumbers() {
        return myService.printAllNumbers();
    }

    @GetMapping(value = "/print", produces = MediaType.APPLICATION_JSON_VALUE)
    public String printNumber(@RequestParam int number){
        return myService.printNumber(number);
    }
}
