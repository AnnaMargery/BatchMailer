/*
 * Copyright (C) 2024 Splunk, Inc. All rights reserved.
 */

package com.batchmailer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MailMessageController {

    @GetMapping("/message")
    public String getHome(){
        return "message";
    }
}
