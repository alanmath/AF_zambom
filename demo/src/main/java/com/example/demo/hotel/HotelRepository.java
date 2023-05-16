package com.example.demo.hotel;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;



public interface HotelRepository extends JpaRepository<Hotel, Long> {
    List<Hotel> findByEstrelasAndValorDiariaGreaterThanEqual(int estrelas, double valorMin);
}
