package com.stp.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transferencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "unidade_origem_id")
    private UnidadeHospitalar unidadeOrigem;

    @ManyToOne
    @JoinColumn(name = "unidade_destino_id")
    private UnidadeHospitalar unidadeDestino;

    private String meioTransporte;
    private String classificacao;
    private LocalDateTime horarioSaida;
    private LocalDateTime horarioPrevistoChegada;
    private String detalhes;
}
