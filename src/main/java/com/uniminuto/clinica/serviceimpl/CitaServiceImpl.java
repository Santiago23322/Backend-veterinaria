package com.uniminuto.clinica.serviceimpl;

import com.uniminuto.clinica.models.Cita;
import com.uniminuto.clinica.repository.CitaRepository;
import com.uniminuto.clinica.service.CitaService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;


    @Override
    public List<Cita> listarCitas(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException {

        return citaRepository
                .findByFechaHoraBetweenOrderByFechaHoraDesc(
                        fechaInicio,
                        fechaFin
                );
    }

    @Override
    public Cita crearCita(Cita cita) throws BadRequestException {

        return citaRepository.save(cita);
    }

    @Override
    public Cita actualizarCita(
            Long id,
            Cita cita
    ) throws BadRequestException {

        Cita citaExistente = citaRepository.findById(id)
                .orElseThrow(() ->
                        new BadRequestException(

                        )
                );

        citaExistente.setClienteId(cita.getClienteId());
        citaExistente.setMascotaId(cita.getMascotaId());
        citaExistente.setMedicoId(cita.getMedicoId());
        citaExistente.setFechaHora(cita.getFechaHora());
        citaExistente.setEstado(cita.getEstado());
        citaExistente.setMotivo(cita.getMotivo());

        return citaRepository.save(citaExistente);
    }
}