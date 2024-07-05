package com.stp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stp.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
