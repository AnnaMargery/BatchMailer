/*
 * Copyright (C) 2024 Splunk, Inc. All rights reserved.
 */

package com.batchmailer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "index";
    }
}
