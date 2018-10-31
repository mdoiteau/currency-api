package com.exo.currencyapi.mock;

import com.exo.currencyapi.model.CurrencyDetails;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CurrencyDetailsMockTest {

    @Test
    public void shouldLoadMock() {
        List<CurrencyDetails> mocks = new CurrencyDetailsDataMock().loadMock();
        assertThat(mocks).isNotEmpty();
        assertThat(mocks).hasSize(6);
    }


}