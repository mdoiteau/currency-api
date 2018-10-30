package com.exo.currencyapi.service;

import com.exo.currencyapi.model.Currency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyServiceTest {

    @InjectMocks
    CurrencyService currencyService;

    @Test
    public void shouldTest() {
        List<Currency> expectedResult = givenACurrencyList();
        assertThat(currencyService.getCurrencyList()).isEqualTo(expectedResult);
    }

    public List<Currency> givenACurrencyList() {
        Currency currency = new Currency();
        currency.setId("Euro");
        currency.setType("national");
        currency.setSymbol("€");
        ArrayList<Currency> currencyList = new ArrayList<>();
        currencyList.add(currency);
        return currencyList;
    }


}