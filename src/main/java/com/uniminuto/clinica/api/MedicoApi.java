package com.uniminuto.clinica.api;

import com.uniminuto.clinica.dto.MedicoEspecializacionDTO;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Define los endpoints relacionados con médicos.
 */
@RequestMapping("/medicos")
public interface MedicoApi {

    /**
     * Lista médicos junto con sus especializaciones.
     *
     * @return lista de médicos.
     */
    @GetMapping("/especializaciones")
    ResponseEntity<List<MedicoEspecializacionDTO>>
    listarMedicosConEspecializacion()
            throws BadRequestException;
}