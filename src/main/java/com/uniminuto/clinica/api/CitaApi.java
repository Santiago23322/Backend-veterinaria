package com.uniminuto.clinica.api;

import com.uniminuto.clinica.models.Cita;
import org.apache.coyote.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/citas")
public interface CitaApi {

    @GetMapping
    ResponseEntity<List<Cita>> listarCitas(
            @RequestParam LocalDateTime fechaInicio,
            @RequestParam LocalDateTime fechaFin
    ) throws BadRequestException;

    @PostMapping
    ResponseEntity<Cita> crearCita(
            @RequestBody Cita cita
    ) throws BadRequestException;

    @PutMapping("/{id}")
    ResponseEntity<Cita> actualizarCita(
            @PathVariable Long id,
            @RequestBody Cita cita
    ) throws BadRequestException;
}
