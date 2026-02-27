/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 *
 * @author Arianna Mora
 */
public class inicio_controller {
  @GetMapping("/")
    public String mostrar_inicio() {
        return "index";
    }  
}
