package com.uniminuto.clinica.service;

import com.uniminuto.clinica.models.FormulaMedica;
import org.apache.coyote.BadRequestException;

import java.util.List;

public interface FormulaMedicaService {

    List<FormulaMedica> listarFormulas() throws BadRequestException;
}
