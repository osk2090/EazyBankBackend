package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class BalanceController {

    @GetMapping("myBalance")
    public String getBalanceDetails() {
        return "Here are the balance details from the DB";
    }
}
