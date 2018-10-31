package com.exo.currencyapi.model.adapter;

import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.model.CurrencyAttributes;
import com.exo.currencyapi.model.CurrencyDetails;
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
        CurrencyDetails currencyDetailsData = new CurrencyDetails();
        String id = "EUR";
        currencyDetailsData.setId(id);
        CurrencyAttributes currencyDetails = new CurrencyAttributes();
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