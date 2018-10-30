package com.exo.currencyapi.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyTest {

    @Test
    public void shouldGetAndSetId() {
        Currency objInstance = new Currency();
        String value = "ABC";
        objInstance.setId(value);
        assertThat(objInstance.getId()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetType() {
        Currency objInstance = new Currency();
        String value = "ABC";
        objInstance.setType(value);
        assertThat(objInstance.getType()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetSymbol() {
        Currency objInstance = new Currency();
        String value = "ABC";
        objInstance.setSymbol(value);
        assertThat(objInstance.getSymbol()).isEqualTo(value);
    }

    @Test
    public void shouldHaveDefaultConstructor() {
        Currency objInstance = new Currency();
        assertThat(objInstance).isNotNull();
    }

    @Test
    public void shouldHaveToStringMethod() {
        Currency objInstance = new Currency();
        assertThat(objInstance.toString()).isNotNull().isNotEmpty();
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(Currency.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .usingGetClass()
                .verify();
    }
}