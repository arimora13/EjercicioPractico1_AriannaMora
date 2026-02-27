/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.salonbelleza.salonbelleza.domain.reserva;
/**
 *
 * @author Arianna Mora
 */
@Repository
public interface reserva_repository extends JpaRepository<reserva, Integer> {   
}
