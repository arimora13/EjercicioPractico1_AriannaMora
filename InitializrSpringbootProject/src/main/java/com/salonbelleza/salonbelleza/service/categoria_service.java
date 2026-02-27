/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.service;
import java.util.List;
import com.salonbelleza.salonbelleza.domain.categoria;
/**
 *
 * @author Arianna Mora
 */
public interface categoria_service {
     public List<categoria> obtenerCategorias();

    public categoria obtenerCategoriaPorId(Integer id);

    public void guardarCategoria(categoria categoria);

    public void eliminarCategoria(Integer id);
}
