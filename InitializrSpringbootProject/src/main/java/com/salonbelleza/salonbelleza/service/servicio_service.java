/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.service;
import java.util.List;
import com.salonbelleza.salonbelleza.domain.servicio;

/**
 *
 * @author Arianna Mora
 */
public interface servicio_service {
   
    public List<servicio> obtenerServicios();

    public servicio obtenerServicioPorId(Integer id);

    public void guardarServicio(servicio servicio);

    public void eliminarServicio(Integer id); 
}
