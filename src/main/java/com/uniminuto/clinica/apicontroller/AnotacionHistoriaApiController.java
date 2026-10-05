package com.uniminuto.clinica.apicontroller;

import com.uniminuto.clinica.api.AnotacionHistoriaApi;
import com.uniminuto.clinica.models.AnotacionHistoria;
import com.uniminuto.clinica.service.AnotacionHistoriaService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class AnotacionHistoriaApiController
        implements AnotacionHistoriaApi {


    @Autowired
    private AnotacionHistoriaService anotacionService;

    @Override
    public ResponseEntity<AnotacionHistoria> crearAnotacion(
            AnotacionHistoria anotacion
    ) throws BadRequestException {

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(
                        anotacionService.crearAnotacion(
                                anotacion
                        )
                );
    }

    @Override
    public ResponseEntity<List<AnotacionHistoria>>
    listarAnotaciones()
            throws BadRequestException {

        return ResponseEntity.ok(
                anotacionService.listarAnotaciones()
        );
    }

    @Override
    public ResponseEntity<List<AnotacionHistoria>>
    listarPorFecha(
            LocalDateTime fechaInicio,
            LocalDateTime fechaFin
    ) throws BadRequestException {

        return ResponseEntity.ok(
                anotacionService.listarPorFecha(
                        fechaInicio,
                        fechaFin
                )
        );
    }

    @Override
    public ResponseEntity<AnotacionHistoria>
    actualizarAnotacion(
            Long id,
            AnotacionHistoria anotacion
    ) throws BadRequestException {

        return ResponseEntity.ok(
                anotacionService.actualizarAnotacion(
                        id,
                        anotacion
                )
        );
    }
}