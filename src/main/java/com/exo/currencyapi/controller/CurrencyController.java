package com.exo.currencyapi.controller;

import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    public CurrencyService currencyService;

    @RequestMapping(value="/getCurrencyList")
    public List<Currency> getCurrencyList() {
        return currencyService.getCurrencyList();
    }

}
