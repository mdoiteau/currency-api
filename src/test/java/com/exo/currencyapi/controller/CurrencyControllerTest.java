package com.exo.currencyapi.controller;

import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.model.CurrencyDetailsData;
import com.exo.currencyapi.service.CurrencyService;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyControllerTest {

    @InjectMocks
    CurrencyController currencyController;

    @Mock
    CurrencyService currencyService;

    @Test
    public void shouldGetCurrencyList() {
        Currency expectedCurrency = new Currency();
        expectedCurrency.setId("test");

        Mockito.when(currencyService.getCurrencyList()).thenReturn(Lists.newArrayList(expectedCurrency));

        List<Currency> currencyListResult = currencyController.getCurrencyList();
        assertThat(currencyListResult).hasSize(1);
        assertThat(currencyListResult).contains(expectedCurrency);
    }

    @Test
    public void shouldGetCurrencyDetails() {
        CurrencyDetailsData expectedCurrency = new CurrencyDetailsData();
        String id = "test";
        expectedCurrency.setId(id);

        Mockito.when(currencyService.getCurrencyDetails(id)).thenReturn(expectedCurrency);

        CurrencyDetailsData currencyDetailsResult = currencyController.getCurrencyDetails(id);
        assertThat(currencyDetailsResult).isNotNull();
        assertThat(currencyDetailsResult).isEqualTo(expectedCurrency);
    }

    @Test
    public void shouldGetNullIfNoExistedCurrencyDetails() {
        Mockito.when(currencyService.getCurrencyDetails(Mockito.any())).thenReturn(null);
        CurrencyDetailsData currencyDetailsResult = currencyController.getCurrencyDetails("test");
        assertThat(currencyDetailsResult).isNull();
    }
}