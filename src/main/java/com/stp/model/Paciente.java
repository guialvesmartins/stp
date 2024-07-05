package com.stp.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String prontuario;
    private String condicao;

}
