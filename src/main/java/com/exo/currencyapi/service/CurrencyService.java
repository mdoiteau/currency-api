package com.exo.currencyapi.service;

import com.exo.currencyapi.mock.CurrencyDetailsDataMock;
import com.exo.currencyapi.model.Currency;
import com.exo.currencyapi.model.CurrencyDetailsData;
import com.exo.currencyapi.model.adapter.CurrencyAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyAdapter currencyAdapter;

    public List<Currency> getCurrencyList() {
        List<CurrencyDetailsData> currencyDetailsDataList = new CurrencyDetailsDataMock().loadMock();
        List<Currency> currencyList = currencyDetailsDataList.stream()
                .map(currencyDetailsData -> currencyAdapter.toCurrency(currencyDetailsData) )
                .collect(Collectors.toList());
        return currencyList;
    }

    public CurrencyDetailsData getCurrencyDetails(String id) {
        List<CurrencyDetailsData> currencyDetailsDataList = new CurrencyDetailsDataMock().loadMock();
        Optional<CurrencyDetailsData> currencyDetailsDataOptional = currencyDetailsDataList.stream()
                .filter(cdd -> cdd.getId().equals(id))
                .findFirst();
        if (currencyDetailsDataOptional.isPresent())
            return currencyDetailsDataOptional.get();
        else
            return null;
    }
}
