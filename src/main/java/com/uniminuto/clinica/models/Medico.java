package com.uniminuto.clinica.models;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_documento")
    private String tipoDocumento;


    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "registro_profesional")
    private String registroProfesional;

    @Column(name = "especializacion_id")
    private Integer especializacionId;
}