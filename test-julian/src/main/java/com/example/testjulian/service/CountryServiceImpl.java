package com.example.testjulian.service;

import com.example.testjulian.model.Country;
import com.example.testjulian.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> listAllCountry() {
        return countryRepository.findAll();
    }

    @Override
    public void SaveIp(Country country) {
        countryRepository.save(country);
    }

}
