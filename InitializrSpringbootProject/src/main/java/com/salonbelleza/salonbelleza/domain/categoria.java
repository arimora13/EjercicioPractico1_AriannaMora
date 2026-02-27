/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salonbelleza.salonbelleza.domain;
import jakarta.persistence.*;
import java.util.List;

/**
 *
 * @author Arianna Mora
 */

@Entity
@Table(name = "categoria")
public class categoria {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id_categoria;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre_categoria;

    @OneToMany(mappedBy = "categoria")
    private List<servicio> listaServicios;

    // Constructor vacío obligatorio
    public categoria() {
    }

    public categoria(String nombreCategoria) {
        this.nombre_categoria = nombreCategoria;
    }


    public Integer getIdCategoria() {
        return id_categoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.id_categoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombre_categoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombre_categoria = nombreCategoria;
    }

    public List<servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }
} 