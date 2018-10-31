package com.exo.currencyapi.model;

import java.util.Objects;

public class CurrencyDetails {

    private String id;
    private CurrencyAttributes attributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CurrencyAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(CurrencyAttributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyDetails that = (CurrencyDetails) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attributes);
    }

    @Override
    public String toString() {
        return "CurrencyDetails{" +
                "id='" + id + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
