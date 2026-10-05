package com.uniminuto.clinica.models;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Representa una especialización médica.
 */
@Data
@Entity
@Table(name = "especializacion")
public class Especializacion {

    /**
     * Identificador de la especialización.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre de la especialización.
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Descripción de la especialización.
     */
    @Column(name = "descripcion")
    private String descripcion;

    /**
     * Código de la especialización.
     */
    @Column(name = "codigo_especializacion")
    private String codigoEspecializacion;
}