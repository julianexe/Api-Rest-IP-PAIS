package com.example.testjulian.service;

import com.example.testjulian.model.Country;

import java.util.List;

public interface ICountryService {
   
   List<Country> listAllCountry();

   void SaveIp(Country country);

}
