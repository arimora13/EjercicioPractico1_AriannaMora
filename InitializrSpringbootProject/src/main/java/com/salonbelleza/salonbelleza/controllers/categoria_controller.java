/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.salonbelleza.salonbelleza.domain.categoria;
import com.salonbelleza.salonbelleza.service.categoria_service;
/**
 *
 * @author Arianna Mora
 */

@Controller
@RequestMapping("/categoria")
public class categoria_controller {
    @Autowired
    private categoria_service categoriaService;

    @GetMapping("/listado")
    public String listado(Model model) {
        var categorias = categoriaService.obtenerCategorias();
        model.addAttribute("categorias", categorias);
        return "categoria/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(categoria categoria) {
        return "categoria/modificar";
    }

    @PostMapping("/guardar")
    public String guardar(categoria categoria) {
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Integer id) {
        categoriaService.eliminarCategoria(id);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable("id") Integer id, Model model) {
        categoria categoria = categoriaService.obtenerCategoriaPorId(id);
        model.addAttribute("categoria", categoria);
        return "categoria/modificar";
    } 
}
