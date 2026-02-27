/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.service.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.salonbelleza.salonbelleza.domain.categoria;
import com.salonbelleza.salonbelleza.repository.categoria_repository;
import com.salonbelleza.salonbelleza.service.categoria_service;
/**
 *
 * @author Arianna Mora
 */
@Service
public class categoriaServiceImpl implements categoria_service {

    @Autowired
    private categoria_repository categoriaRepository;

    @Override
    public List<categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public categoria obtenerCategoriaPorId(Integer id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void guardarCategoria(categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public void eliminarCategoria(Integer id) {
        categoriaRepository.deleteById(id);
    }
}