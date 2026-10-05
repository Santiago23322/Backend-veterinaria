package com.uniminuto.clinica.service;

import com.uniminuto.clinica.models.Cita;
import org.apache.coyote.BadRequestException;

import java.time.LocalDateTime;
import java.util.List;

public interface CitaService {

    List<Cita> listarCitas(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException;


    Cita crearCita(Cita cita) throws BadRequestException;

    Cita actualizarCita(Long id, Cita cita) throws BadRequestException;
}