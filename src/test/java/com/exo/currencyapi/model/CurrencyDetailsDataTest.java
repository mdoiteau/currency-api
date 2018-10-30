package com.exo.currencyapi.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyDetailsDataTest {

    @Test
    public void shouldGetAndSetId() {
        CurrencyDetailsData objInstance = new CurrencyDetailsData();
        String value = "ABC";
        objInstance.setId(value);
        assertThat(objInstance.getId()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetAttributes() {
        CurrencyDetailsData objInstance = new CurrencyDetailsData();
        CurrencyDetails value = new CurrencyDetails();
        objInstance.setAttributes(value);
        assertThat(objInstance.getAttributes()).isEqualTo(value);
    }

    @Test
    public void shouldHaveDefaultConstructor() {
        CurrencyDetailsData objInstance = new CurrencyDetailsData();
        assertThat(objInstance).isNotNull();
    }

    @Test
    public void shouldHaveToStringMethod() {
        CurrencyDetailsData objInstance = new CurrencyDetailsData();
        assertThat(objInstance.toString()).isNotNull().isNotEmpty();
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(CurrencyDetailsData.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .usingGetClass()
                .verify();
    }
}