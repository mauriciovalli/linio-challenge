
/*
 * (C) Copyright  2011/2021 MVALLI.  All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF MVALLI.
 * The copyright notice above does not evidence any actual or intended
 * publication of such source code.
 */

package com.linio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(proxyBeanMethods = false)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
