package com.uniminuto.clinica.serviceimpl;

import com.uniminuto.clinica.models.AnotacionHistoria;
import com.uniminuto.clinica.repository.AnotacionHistoriaRepository;
import com.uniminuto.clinica.service.AnotacionHistoriaService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AnotacionHistoriaServiceImpl
        implements AnotacionHistoriaService {

    @Autowired
    private AnotacionHistoriaRepository anotacionRepository;

    @Override
    public AnotacionHistoria crearAnotacion(
            AnotacionHistoria anotacion
    ) throws BadRequestException {

        if (anotacion == null) {
            throw new BadRequestException(
                    "La anotación es obligatoria."
            );
        }

        if (anotacion.getFecha() == null) {
            anotacion.setFecha(LocalDateTime.now());
        }

        return anotacionRepository.save(anotacion);
    }

    @Override
    public List<AnotacionHistoria> listarAnotaciones()
            throws BadRequestException {

        return anotacionRepository.findAll();
    }

    @Override
    public AnotacionHistoria actualizarAnotacion(
            Long id,
            AnotacionHistoria anotacion
    ) throws BadRequestException {

        AnotacionHistoria existente =
                anotacionRepository.findById(id)
                        .orElseThrow(() ->
                                new BadRequestException(
                                        "La anotación no existe."
                                )
                        );

        existente.setHistoriaId(
                anotacion.getHistoriaId()
        );

        existente.setMedicoId(
                anotacion.getMedicoId()
        );

        existente.setFecha(
                anotacion.getFecha()
        );

        existente.setDescripcion(
                anotacion.getDescripcion()
        );

        return anotacionRepository.save(existente);
    }

    @Override
    public List<AnotacionHistoria> listarPorFecha(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException {

        if (fechaInicio == null || fechaFin == null) {
            throw new BadRequestException(
                    "Las fechas son obligatorias."
            );
        }

        if (fechaInicio.isAfter(fechaFin)) {
            throw new BadRequestException(
                    "La fecha inicial no puede ser mayor que la fecha final."
            );
        }

        return anotacionRepository
                .findByFechaBetweenOrderByFechaDesc(
                        fechaInicio,
                        fechaFin
                );
    }
}