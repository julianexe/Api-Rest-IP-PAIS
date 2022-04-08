package com.example.testjulian.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

@Entity
@Getter
@Setter

public class DataIP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String country_name;
    private String region_name;

}
