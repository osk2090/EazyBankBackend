package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CardsController {

    @GetMapping("myCards")
    public String getCardDetails() {
        return "Here are the card details from the DB";
    }
}
