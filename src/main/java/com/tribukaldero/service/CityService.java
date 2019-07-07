package com.tribukaldero.service;

import com.tribukaldero.model.city.City;
import com.tribukaldero.repository.city.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> listAll() {
        return cityRepository.findAll();
    }


}
