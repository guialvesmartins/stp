package com.stp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UnidadeHospitalar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String endereco;
    private String contato;
    private String tipo;
}
