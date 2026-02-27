/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.service.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salonbelleza.salonbelleza.domain.queja;
import com.salonbelleza.salonbelleza.repository.queja_repositorio;
import com.salonbelleza.salonbelleza.service.queja_service;
/**
 *
 * @author Arianna Mora
 */
@Service
public class queja_serviceImpl implements queja_service{
     @Autowired
    private queja_repositorio quejaRepository;

    @Override
    public List<queja> obtenerQuejas() {
        return quejaRepository.findAll();
    }

    @Override
    public void guardarQueja(queja queja) {
        quejaRepository.save(queja);
    }
}

