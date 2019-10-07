package az.pashabank.ls.msnotifier.controller;

import az.pashabank.ls.msnotifier.service.CityService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(name = "/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public void addCity(String city){
        cityService.addCity(city);
    }

    @DeleteMapping
    public void deleteCity(String city){
        cityService.deleteCity(city);
    }
}
