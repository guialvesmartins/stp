package com.stp.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransferenciaDTO {
    private Long id;
    private Long pacienteId;
    private Long origemId;
    private Long destinoId;
    private String meioTransporte;
    private LocalDateTime horarioSaida;
    private LocalDateTime horarioChegada;
}
