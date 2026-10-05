package com.uniminuto.clinica.api;

import com.uniminuto.clinica.models.AnotacionHistoria;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RequestMapping("/anotaciones-historia")
public interface AnotacionHistoriaApi {

    @PostMapping
    ResponseEntity<AnotacionHistoria> crearAnotacion(
            @RequestBody AnotacionHistoria anotacion
    ) throws BadRequestException;


    @GetMapping
    ResponseEntity<List<AnotacionHistoria>> listarAnotaciones()
            throws BadRequestException;

    @GetMapping("/filtrar")
    ResponseEntity<List<AnotacionHistoria>> listarPorFecha(
            @RequestParam("fechaInicio") LocalDateTime fechaInicio,
            @RequestParam("fechaFin") LocalDateTime fechaFin
    ) throws BadRequestException;

    @PutMapping("/{id}")
    ResponseEntity<AnotacionHistoria> actualizarAnotacion(
            @PathVariable("id") Long id,
            @RequestBody AnotacionHistoria anotacion
    ) throws BadRequestException;
}