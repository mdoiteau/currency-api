package com.exo.currencyapi.service;

import com.exo.currencyapi.model.adapter.CurrencyAdapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyServiceTest {

    @InjectMocks
    CurrencyService currencyService;

    @Mock
    CurrencyAdapter currencyAdapter;

    @Test
    public void shouldGetCurrencyList() {
        assertThat(currencyService.getCurrencyList()).isNotEmpty();
        assertThat(currencyService.getCurrencyList()).hasSize(6);
    }


}