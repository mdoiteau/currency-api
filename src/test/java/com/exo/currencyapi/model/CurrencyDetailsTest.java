package com.exo.currencyapi.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
public class CurrencyDetailsTest {

    @Test
    public void shouldGetAndSetCode() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setCode(value);
        assertThat(objInstance.getCode()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetName() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setName(value);
        assertThat(objInstance.getName()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCurrency_type() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setCurrency_type(value);
        assertThat(objInstance.getCurrency_type()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCode_iso_numeric3() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setCode_iso_numeric3(value);
        assertThat(objInstance.getCode_iso_numeric3()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCode_iso_alpha3() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setCode_iso_alpha3(value);
        assertThat(objInstance.getCode_iso_alpha3()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetSymbol() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setSymbol(value);
        assertThat(objInstance.getSymbol()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetNative_symbol() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setNative_symbol(value);
        assertThat(objInstance.getNative_symbol()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCategory() {
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setCategory(value);
        assertThat(objInstance.getCategory()).isEqualTo(value);
    }

    @Test
    public void shouldHaveDefaultConstructor() {
        CurrencyDetails objInstance = new CurrencyDetails();
        assertThat(objInstance).isNotNull();
    }

    @Test
    public void shouldHaveToStringMethod() {
        CurrencyDetails objInstance = new CurrencyDetails();
        assertThat(objInstance.toString()).isNotNull().isNotEmpty();
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(CurrencyDetails.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .usingGetClass()
                .verify();
    }
}