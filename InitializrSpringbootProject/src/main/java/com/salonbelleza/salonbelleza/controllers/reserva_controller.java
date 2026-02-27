/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.salonbelleza.salonbelleza.domain.reserva;
import com.salonbelleza.salonbelleza.service.reserva_service;
import com.salonbelleza.salonbelleza.service.servicio_service;
/**
 *
 * @author Arianna Mora
 */

@Controller
@RequestMapping("/reserva")
public class reserva_controller {
 @Autowired
    private reserva_service reservaService;

    @Autowired
    private servicio_service servicioService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var reservas = reservaService.obtenerReservas();
        model.addAttribute("reservas", reservas);
        return "reserva/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(reserva reserva, Model model) {
        model.addAttribute("servicios", servicioService.obtenerServicios());
        return "reserva/modificar";
    }

    @PostMapping("/guardar")
    public String guardar(reserva reserva) {
        reservaService.guardarReserva(reserva);
        return "redirect:/reserva/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        reservaService.eliminarReserva(id);
        return "redirect:/reserva/listado";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        reserva reserva = reservaService.obtenerReservaPorId(id);
        model.addAttribute("reserva", reserva);
        model.addAttribute("servicios", servicioService.obtenerServicios());
        return "reserva/modificar";
    }
}
