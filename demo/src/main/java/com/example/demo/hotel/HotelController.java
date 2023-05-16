package com.example.demo.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelController {
    @Autowired
    private HotelService service;

    @GetMapping("/hotel")
    public List<Hotel> getHotels(@RequestParam(required = false) Integer estrelas, 
                                 @RequestParam(required = false) Double valorMin) {
        if (estrelas != null && valorMin != null) {
            return service.findByEstrelasAndValorDiariaGreaterThanEqual(estrelas, valorMin);
        }
        return service.findAll();
    }

    @GetMapping("/hotel/{id}")
    public Hotel getHotelById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping("/hotel")
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return service.save(hotel);
    }

    @DeleteMapping("/hotel/{id}")
    public void deleteHotel(@PathVariable Long id) {
        service.deleteById(id);
    }
}
