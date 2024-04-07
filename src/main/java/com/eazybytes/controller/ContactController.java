package com.eazybytes.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class ContactController {

    @GetMapping("contact")
    public String saveContactInquiryDetails() {
        return "Inquiry details are saved to the DB";
    }
}
