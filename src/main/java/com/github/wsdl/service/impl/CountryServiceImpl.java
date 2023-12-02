package com.github.wsdl.service.impl;

import com.github.wsdl.service.CountryService;
import com.github.wsdl.ws.client.Country;
import com.github.wsdl.ws.client.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Override
    public List<Country> get() {
        Country country = new Country();
        country.setName("India");
        country.setCapital("Delhi");
        country.setCurrency(Currency.INR);
        country.setPopulation(1400000000);
        return List.of(country);
    }
}
