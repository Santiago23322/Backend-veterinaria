package com.uniminuto.clinica.repository;

import com.uniminuto.clinica.dto.MedicoEspecializacionDTO;
import com.uniminuto.clinica.models.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Repositorio para acceder a la información de los médicos.
 */
public interface MedicoRepository
        extends JpaRepository<Medico, Long> {

    /**
     * Obtiene los médicos junto con sus especializaciones.
     *
     * @return lista de médicos y especializaciones.
     */
    @Query("""
            SELECT new com.uniminuto.clinica.dto.MedicoEspecializacionDTO(
                m.id,
                m.nombres,
                m.apellidos,
                m.registroProfesional,
                e.id,
                e.nombre,
                e.descripcion
            )
            FROM Medico m
            JOIN Especializacion e
                ON m.especializacionId = e.id
            """)
    List<MedicoEspecializacionDTO>
    listarMedicosConEspecializacion();
}