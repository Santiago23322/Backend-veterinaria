package com.uniminuto.clinica.serviceimpl;

import com.uniminuto.clinica.dto.MedicoEspecializacionDTO;
import com.uniminuto.clinica.repository.MedicoRepository;
import com.uniminuto.clinica.service.MedicoService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementa las operaciones relacionadas con los médicos.
 */
@Service
public class MedicoServiceImpl implements MedicoService {

    /**
     * Repositorio de médicos.
     */
    @Autowired
    private MedicoRepository medicoRepository;

    /**
     * Lista médicos con sus especializaciones.
     *
     * @return lista de médicos y especializaciones.
     */
    @Override
    public List<MedicoEspecializacionDTO>
    listarMedicosConEspecializacion()
            throws BadRequestException {

        return medicoRepository
                .listarMedicosConEspecializacion();
    }
}