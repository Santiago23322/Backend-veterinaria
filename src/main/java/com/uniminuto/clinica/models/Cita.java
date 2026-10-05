package com.uniminuto.clinica.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cliente_id")
    private Integer clienteId;

    @Column(name = "mascota_id")
    private Integer mascotaId;

    @Column(name = "medico_id")
    private Integer medicoId;

    @Column(name = "fecha_hora")
    private LocalDateTime fechaHora;

    @Column(name = "estado")
    private String estado;

    @Column(name = "motivo")
    private String motivo;
}