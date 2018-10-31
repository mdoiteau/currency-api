package com.exo.currencyapi.mock;

import com.exo.currencyapi.model.CurrencyDetails;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurrencyDetailsDataMock {

    public List<CurrencyDetails> loadMock() {
        Gson gson = new Gson();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("mock/Currencies.json").getFile());
            JsonReader reader = new JsonReader(new FileReader(file));
            CurrencyDetails[] list = gson.fromJson(reader, CurrencyDetails[].class);
            return Arrays.asList(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
