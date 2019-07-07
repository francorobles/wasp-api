package com.tribukaldero.controller.v1;

import com.tribukaldero.model.city.City;
import com.tribukaldero.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping(value = "/cities")
    public @ResponseBody List<City> cities() {
        return cityService.listAll();
    }


}
