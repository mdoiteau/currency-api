package com.exo.currencyapi.service;

import com.exo.currencyapi.model.Currency;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {
    public List<Currency> getCurrencyList() {
        Currency currency = new Currency();
        currency.setId("Euro");
        currency.setType("national");
        currency.setSymbol("€");
        ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(currency);
        return currencyList;
    }
}
