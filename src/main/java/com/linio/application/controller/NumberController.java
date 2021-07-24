/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.application.controller;

import com.linio.domain.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumberController {

    private final NumberService myService;

    @Autowired
    public NumberController(NumberService myService) {
        this.myService = myService;
    }

    @RequestMapping("/print")
    public String getTasks(Model model) {
        model.addAttribute("numbers", myService.printAllNumbers().getContent());
        return "numbers/list";
    }
}
