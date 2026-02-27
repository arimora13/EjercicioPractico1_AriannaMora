/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.salonbelleza.salonbelleza.domain.queja;
import com.salonbelleza.salonbelleza.service.queja_service;
/**
 *
 * @author Arianna Mora
 */
@Controller
@RequestMapping("/queja")
public class queja_controller {
   @Autowired
    private queja_service quejaService;

    @GetMapping("/formulario")
    public String formulario(queja queja) {
        return "queja/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(queja queja) {
        quejaService.guardarQueja(queja);
        return "redirect:/";
    }

    @GetMapping("/listado")
    public String listado(Model model) {
        model.addAttribute("quejas", quejaService.obtenerQuejas());
        return "queja/listado";
    }
}