package com.uniminuto.clinica.serviceimpl;

import com.uniminuto.clinica.models.FormulaMedica;
import com.uniminuto.clinica.repository.FormulaMedicaRepository;
import com.uniminuto.clinica.service.FormulaMedicaService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormulaMedicaServiceImpl implements FormulaMedicaService {

    @Autowired
    private FormulaMedicaRepository formulaMedicaRepository;

    @Override
    public List<FormulaMedica> listarFormulas() throws BadRequestException {
        return formulaMedicaRepository
                .findAllByOrderByFechaCreacionRegistroDesc();
    }
}