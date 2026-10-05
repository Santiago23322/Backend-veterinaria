package com.uniminuto.clinica.dto;

import lombok.Data;

/**
 * DTO utilizado para mostrar un médico junto con
 * la información de su especialización.
 */
@Data
public class MedicoEspecializacionDTO {

    /**
     * Identificador del médico.
     */
    private Long medicoId;

    /**
     * Nombres del médico.
     */
    private String nombres;

    /**
     * Apellidos del médico.
     */
    private String apellidos;

    /**
     * Registro profesional.
     */
    private String registroProfesional;

    /**
     * Identificador de la especialización.
     */
    private Long especializacionId;

    /**
     * Nombre de la especialización.
     */
    private String especializacion;

    /**
     * Descripción de la especialización.
     */
    private String descripcionEspecializacion;

    /**
     * Constructor utilizado por la consulta JPQL.
     *
     * @param medicoId identificador del médico.
     * @param nombres nombres.
     * @param apellidos apellidos.
     * @param registroProfesional registro profesional.
     * @param especializacionId identificador de especialización.
     * @param especializacion nombre.
     * @param descripcionEspecializacion descripción.
     */
    public MedicoEspecializacionDTO(
            Long medicoId,
            String nombres,
            String apellidos,
            String registroProfesional,
            Long especializacionId,
            String especializacion,
            String descripcionEspecializacion
    ) {
        this.medicoId = medicoId;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.registroProfesional = registroProfesional;
        this.especializacionId = especializacionId;
        this.especializacion = especializacion;
        this.descripcionEspecializacion =
                descripcionEspecializacion;
    }
}