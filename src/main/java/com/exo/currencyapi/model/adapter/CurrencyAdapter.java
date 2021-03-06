package com.exo.currencyapi.model.adapter;

import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.model.CurrencyDetails;
import org.springframework.stereotype.Service;

@Service
public class CurrencyAdapter {

    public Currency toCurrency(CurrencyDetails currencyDetailsData) {
        Currency currency = new Currency();
        currency.setId(currencyDetailsData.getId());
        currency.setSymbol(currencyDetailsData.getAttributes().getSymbol());
        currency.setType(currencyDetailsData.getAttributes().getCurrency_type());
        return currency;
    }

}
