package com.uniminuto.clinica.service;

import com.uniminuto.clinica.models.AnotacionHistoria;
import org.apache.coyote.BadRequestException;

import java.time.LocalDateTime;
import java.util.List;

public interface AnotacionHistoriaService {

    AnotacionHistoria crearAnotacion(
            AnotacionHistoria anotacion
    ) throws BadRequestException;

    List<AnotacionHistoria> listarAnotaciones()
            throws BadRequestException;

    AnotacionHistoria actualizarAnotacion(
            Long id,
            AnotacionHistoria anotacion
    ) throws BadRequestException;

    List<AnotacionHistoria> listarPorFecha(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException;
}
