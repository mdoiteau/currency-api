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
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setCode(value);
        assertThat(objInstance.getCode()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetName() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setName(value);
        assertThat(objInstance.getName()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCurrency_type() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setCurrency_type(value);
        assertThat(objInstance.getCurrency_type()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCode_iso_numeric3() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setCode_iso_numeric3(value);
        assertThat(objInstance.getCode_iso_numeric3()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCode_iso_alpha3() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setCode_iso_alpha3(value);
        assertThat(objInstance.getCode_iso_alpha3()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetSymbol() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setSymbol(value);
        assertThat(objInstance.getSymbol()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetNative_symbol() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setNative_symbol(value);
        assertThat(objInstance.getNative_symbol()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetCategory() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        String value = "ABC";
        objInstance.setCategory(value);
        assertThat(objInstance.getCategory()).isEqualTo(value);
    }

    @Test
    public void shouldHaveDefaultConstructor() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        assertThat(objInstance).isNotNull();
    }

    @Test
    public void shouldHaveToStringMethod() {
        CurrencyAttributes objInstance = new CurrencyAttributes();
        assertThat(objInstance.toString()).isNotNull().isNotEmpty();
    }

    @Test
    public void equalsContract() {
        EqualsVerifier.forClass(CurrencyAttributes.class)
                .suppress(Warning.NONFINAL_FIELDS)
                .usingGetClass()
                .verify();
    }
}