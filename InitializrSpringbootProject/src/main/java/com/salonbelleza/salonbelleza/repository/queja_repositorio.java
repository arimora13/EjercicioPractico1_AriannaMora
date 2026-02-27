/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.salonbelleza.salonbelleza.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.salonbelleza.salonbelleza.domain.queja;
/**
 *
 * @author Arianna Mora
 */
public interface queja_repositorio extends JpaRepository<queja, Integer>{
    
}
