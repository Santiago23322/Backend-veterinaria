package com.uniminuto.clinica.apicontroller;

import com.uniminuto.clinica.api.CitaApi;
import com.uniminuto.clinica.models.Cita;
import com.uniminuto.clinica.service.CitaService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CitaApiController implements CitaApi {

    @Autowired
    private CitaService citaService;

    @Override
    public ResponseEntity<List<Cita>> listarCitas(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException {

        return ResponseEntity.ok(
                citaService.listarCitas(
                        fechaInicio,
                        fechaFin
                )
        );
    }

    @Override
    public ResponseEntity<Cita> crearCita(
            Cita cita
    ) throws BadRequestException {

        return ResponseEntity.ok(
                citaService.crearCita(cita)
        );
    }

    @Override
    public ResponseEntity<Cita> actualizarCita(
            Long id,
            Cita cita
    ) throws BadRequestException {

        return ResponseEntity.ok(
                citaService.actualizarCita(
                        id,
                        cita
                )
        );
    }
}
