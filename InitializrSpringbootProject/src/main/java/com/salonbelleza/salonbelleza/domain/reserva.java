package com.salonbelleza.salonbelleza.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "reserva")
public class reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idReserva;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @ManyToOne
    @JoinColumn(name = "servicio_id")
    private servicio servicio;

    // ===== GETTERS Y SETTERS =====

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fecha;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fecha = fechaReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public servicio getServicio() {
        return servicio;
    }

    public void setServicio(servicio servicio) {
        this.servicio = servicio;
    }
}