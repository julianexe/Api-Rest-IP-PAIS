package com.example.testjulian.controller;

import com.example.testjulian.model.Country;
import com.example.testjulian.service.CountryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryServiceImpl countryService;

    @GetMapping("/consulta/{nombre_pais}")
    public List<Country> listar() {
        return countryService.listAllCountry();
    }

    @PostMapping("/registro/ip")
    public String save(@RequestBody Country country) {
         countryService.SaveIp(country);
        return "ip saved";
    }

}
