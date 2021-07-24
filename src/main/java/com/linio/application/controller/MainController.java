/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Linio Challenge!!!";
    }
}
