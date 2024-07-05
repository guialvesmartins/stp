package com.stp.dto;

import lombok.Data;

@Data
public class PacienteDTO {
    private Long id;
    private String nome;
    private String cpf;
    private String prontuario;
    private String condicao;
}
