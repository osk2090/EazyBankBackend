package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class NoticesController {

    @GetMapping("notices")
    public String getNotice() {
        return "Here are the notices details from the DB";
    }
}
