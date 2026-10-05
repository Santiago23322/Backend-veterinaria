package com.uniminuto.clinica.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "anotacion_historia")
public class AnotacionHistoria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "historia_id")
    private Integer historiaId;

    @Column(name = "medico_id")
    private Integer medicoId;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "descripcion")
    private String descripcion;
}
