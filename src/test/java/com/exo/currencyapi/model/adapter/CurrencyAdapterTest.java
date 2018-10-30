package com.exo.currencyapi.model.adapter;

import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.model.CurrencyDetails;
import com.exo.currencyapi.model.CurrencyDetailsData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyAdapterTest {

    @InjectMocks
    CurrencyAdapter currencyAdapter;

    @Test
    public void shouldAdapt() {
        CurrencyDetailsData currencyDetailsData = new CurrencyDetailsData();
        String id = "EUR";
        currencyDetailsData.setId(id);
        CurrencyDetails currencyDetails = new CurrencyDetails();
        String symbol = "€";
        currencyDetails.setSymbol(symbol);
        String type = "national";
        currencyDetails.setCurrency_type(type);
        currencyDetailsData.setAttributes(currencyDetails);

        Currency currencyResult = currencyAdapter.toCurrency(currencyDetailsData);

        assertThat(currencyResult).isNotNull();
        assertThat(currencyResult.getId()).isEqualTo(id);
        assertThat(currencyResult.getSymbol()).isEqualTo(symbol);
        assertThat(currencyResult.getType()).isEqualTo(type);

    }


}