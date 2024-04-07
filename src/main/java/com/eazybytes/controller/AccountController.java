package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class AccountController {

    @GetMapping("myAccount")
    public String getAccountDetails() {
        return "Here are the account details from the DB";
    }
}
