/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.salonbelleza.salonbelleza.domain.servicio;
/**
 *
 * @author Arianna Mora
 */
@Repository
public interface servicio_repository extends JpaRepository<servicio, Integer> {
    
}
