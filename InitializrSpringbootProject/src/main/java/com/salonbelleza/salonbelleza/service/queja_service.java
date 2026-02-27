/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.service;
import java.util.List;
import com.salonbelleza.salonbelleza.domain.queja;
/**
 *
 * @author Arianna Mora
 */
public interface queja_service {

    public List<queja> obtenerQuejas();

    public void guardarQueja(queja queja);
}
