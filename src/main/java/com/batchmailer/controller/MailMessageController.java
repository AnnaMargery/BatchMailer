/*
 * Copyright (C) 2024 Splunk, Inc. All rights reserved.
 */

package com.batchmailer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("messages")
public class MailMessageController {

  // without db- storing here
  private String providedMessage;

  @GetMapping("/")
  public String getHome() {
    return "message";
  }

  @PostMapping("/")
  public String provideMessage(@RequestParam String message, Model model) {
    this.providedMessage = message; // todo after add service and repo layers
    model.addAttribute("message", message);
    return "redirect:/status";
  }

  @GetMapping("/status")
  public String getStatusPage() {
    // todo update status page- mistakes...
    return "status";
  }
}
