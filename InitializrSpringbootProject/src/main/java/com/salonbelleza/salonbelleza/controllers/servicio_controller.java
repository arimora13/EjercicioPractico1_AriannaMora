/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.salonbelleza.salonbelleza.domain.servicio;
import com.salonbelleza.salonbelleza.service.servicio_service;
import com.salonbelleza.salonbelleza.service.categoria_service;
/**
 *
 * @author Arianna Mora
 */
@Controller
@RequestMapping("/servicio")
public class servicio_controller {
    @Autowired
    private servicio_service servicioService;

    @Autowired
    private categoria_service categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var servicios = servicioService.obtenerServicios();
        model.addAttribute("servicios", servicios);
        return "servicio/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(servicio servicio, Model model) {
        model.addAttribute("categorias", categoriaService.obtenerCategorias());
        return "servicio/modificar";
    }

    @PostMapping("/guardar")
    public String guardar(servicio servicio) {
        servicioService.guardarServicio(servicio);
        return "redirect:/servicio/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        servicioService.eliminarServicio(id);
        return "redirect:/servicio/listado";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        servicio servicio = servicioService.obtenerServicioPorId(id);
        model.addAttribute("servicio", servicio);
        model.addAttribute("categorias", categoriaService.obtenerCategorias());
        return "servicio/modificar";
    }
}

