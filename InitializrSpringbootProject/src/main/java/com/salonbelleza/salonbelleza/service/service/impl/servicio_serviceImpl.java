/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.service.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salonbelleza.salonbelleza.domain.servicio;
import com.salonbelleza.salonbelleza.repository.servicio_repository;
import com.salonbelleza.salonbelleza.service.servicio_service;
/**
 *
 * @author Arianna Mora
 */
 @Service
public class servicio_serviceImpl implements servicio_service {
    
     @Autowired
    private servicio_repository servicioRepository;

    @Override
    public List<servicio> obtenerServicios() {
        return servicioRepository.findAll();
    }

    @Override
    public servicio obtenerServicioPorId(Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarServicio(servicio servicio) {
        servicioRepository.save(servicio);
    }

    @Override
    public void eliminarServicio(Integer id) {
        servicioRepository.deleteById(id);
    }
}
