package com.uniminuto.clinica.service;

import com.uniminuto.clinica.dto.MedicoEspecializacionDTO;
import org.apache.coyote.BadRequestException;

import java.util.List;

/**
 * Define las operaciones relacionadas con médicos.
 */
public interface MedicoService {

    /**
     * Lista médicos junto con sus especializaciones.
     *
     * @return lista de médicos.
     */
    List<MedicoEspecializacionDTO>
    listarMedicosConEspecializacion()
            throws BadRequestException;
}