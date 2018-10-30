package com.exo.currencyapi.model;

import java.util.Objects;

public class CurrencyDetailsData {

    private String id;
    private CurrencyDetails attributes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CurrencyDetails getAttributes() {
        return attributes;
    }

    public void setAttributes(CurrencyDetails attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyDetailsData that = (CurrencyDetailsData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attributes);
    }

    @Override
    public String toString() {
        return "CurrencyDetailsData{" +
                "id='" + id + '\'' +
                ", attributes=" + attributes +
                '}';
    }
}
