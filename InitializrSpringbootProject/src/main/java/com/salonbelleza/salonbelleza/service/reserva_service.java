/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.service;
import java.util.List;
import com.salonbelleza.salonbelleza.domain.reserva;

/**
 *
 * @author Arianna Mora
 */
public interface reserva_service {
   public List<reserva> obtenerReservas();

    public reserva obtenerReservaPorId(Integer id);

    public void guardarReserva(reserva reserva);

    public void eliminarReserva(Integer id);
    
}
