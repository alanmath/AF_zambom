package com.example.demo.hotel;

import java.util.List;

public interface HotelService {
    List<Hotel> findAll();
    Hotel findById(Long id);
    List<Hotel> findByEstrelasAndValorDiariaGreaterThanEqual(int estrelas, double valorMin);
    Hotel save(Hotel hotel);
    void deleteById(Long id);
}
