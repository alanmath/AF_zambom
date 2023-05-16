package com.example.demo.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository repository;

    @Override
    public List<Hotel> findAll() {
        return repository.findAll();
    }

    @Override
    public Hotel findById(Long id) {
        Optional<Hotel> optHotel = repository.findById(id);
        return optHotel.orElse(null);
    }

    @Override
    public List<Hotel> findByEstrelasAndValorDiariaGreaterThanEqual(int estrelas, double valorMin) {
        return repository.findByEstrelasAndValorDiariaGreaterThanEqual(estrelas, valorMin);
    }

    @Override
    public Hotel save(Hotel hotel) {
        return repository.save(hotel);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
