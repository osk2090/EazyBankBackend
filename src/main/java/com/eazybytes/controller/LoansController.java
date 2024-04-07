package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoansController {

    @GetMapping("myLoans")
    public String getLoansDetails() {
        return "Here are the loans details from the DB";
    }
}
