package com.uniminuto.clinica.apicontroller;

import com.uniminuto.clinica.api.MedicoApi;
import com.uniminuto.clinica.dto.MedicoEspecializacionDTO;
import com.uniminuto.clinica.service.MedicoService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador de médicos.
 */
@RestController
public class MedicoApiController implements MedicoApi {

    /**
     * Servicio de médicos.
     */
    @Autowired
    private MedicoService medicoService;

    /**
     * Lista médicos con especialización.
     *
     * @return lista de médicos.
     */
    @Override
    public ResponseEntity<List<MedicoEspecializacionDTO>>
    listarMedicosConEspecializacion()
            throws BadRequestException {

        return ResponseEntity.ok(
                medicoService
                        .listarMedicosConEspecializacion()
        );
    }
}