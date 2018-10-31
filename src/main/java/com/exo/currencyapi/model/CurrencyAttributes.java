package com.exo.currencyapi.model;

import java.util.Objects;

public class CurrencyAttributes {

    private String code;
    private String name;
    private String currency_type;
    private String code_iso_numeric3;
    private String code_iso_alpha3;
    private String symbol;
    private String native_symbol;
    private String category;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(String currency_type) {
        this.currency_type = currency_type;
    }

    public String getCode_iso_numeric3() {
        return code_iso_numeric3;
    }

    public void setCode_iso_numeric3(String code_iso_numeric3) {
        this.code_iso_numeric3 = code_iso_numeric3;
    }

    public String getCode_iso_alpha3() {
        return code_iso_alpha3;
    }

    public void setCode_iso_alpha3(String code_iso_alpha3) {
        this.code_iso_alpha3 = code_iso_alpha3;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getNative_symbol() {
        return native_symbol;
    }

    public void setNative_symbol(String native_symbol) {
        this.native_symbol = native_symbol;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrencyAttributes that = (CurrencyAttributes) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(name, that.name) &&
                Objects.equals(currency_type, that.currency_type) &&
                Objects.equals(code_iso_numeric3, that.code_iso_numeric3) &&
                Objects.equals(code_iso_alpha3, that.code_iso_alpha3) &&
                Objects.equals(symbol, that.symbol) &&
                Objects.equals(native_symbol, that.native_symbol) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, currency_type, code_iso_numeric3, code_iso_alpha3, symbol, native_symbol, category);
    }

    @Override
    public String
    toString() {
        return "CurrencyAttributes{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", currency_type='" + currency_type + '\'' +
                ", code_iso_numeric3='" + code_iso_numeric3 + '\'' +
                ", code_iso_alpha3='" + code_iso_alpha3 + '\'' +
                ", symbol='" + symbol + '\'' +
                ", native_symbol='" + native_symbol + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
