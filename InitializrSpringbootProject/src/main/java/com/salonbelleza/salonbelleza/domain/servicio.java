/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.domain;
import jakarta.persistence.*;
/**
 *
 * @author Arianna Mora
 */

@Entity
@Table(name = "servicio")
public class servicio {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idServicio;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombreServicio;

    @Column(name = "precio", nullable = false)
    private Double precioServicio;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private categoria categoria;

    // Constructor vacío obligatorio
    public servicio() {
    }

    // Constructor con parámetros
        public servicio(String nombreServicio, Double precioServicio, categoria categoria) {
        this.nombreServicio  = nombreServicio;
        this.precioServicio  = precioServicio;
        this.categoria = categoria;
    }

    // Getters y Setters

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(Double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
}

