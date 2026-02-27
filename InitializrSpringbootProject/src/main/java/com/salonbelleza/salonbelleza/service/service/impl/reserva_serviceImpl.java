/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.service.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salonbelleza.salonbelleza.domain.reserva;
import com.salonbelleza.salonbelleza.repository.reserva_repository;
import com.salonbelleza.salonbelleza.service.reserva_service;

/**
 *
 * @author Arianna Mora
 */

@Service
public class reserva_serviceImpl implements reserva_service {

    @Autowired
    private reserva_repository reservaRepository;

    @Override
    public List<reserva> obtenerReservas() {
        return reservaRepository.findAll();
    }

    @Override
    public reserva obtenerReservaPorId(Integer id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarReserva(reserva reserva) {
        reservaRepository.save(reserva);
    }

    @Override
    public void eliminarReserva(Integer id) {
        reservaRepository.deleteById(id);
    }  
}
