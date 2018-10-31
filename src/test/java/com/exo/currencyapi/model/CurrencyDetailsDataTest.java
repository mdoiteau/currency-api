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
        CurrencyDetails objInstance = new CurrencyDetails();
        String value = "ABC";
        objInstance.setId(value);
        assertThat(objInstance.getId()).isEqualTo(value);
    }

    @Test
    public void shouldGetAndSetAttributes() {
        CurrencyDetails objInstance = new CurrencyDetails();
        CurrencyAttributes value = new CurrencyAttributes();
        objInstance.setAttributes(value);
        assertThat(objInstance.getAttributes()).isEqualTo(value);
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