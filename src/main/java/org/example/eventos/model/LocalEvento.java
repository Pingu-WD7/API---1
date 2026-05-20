package org.example.eventos.model;

import jakarta.persistence.*;

@Entity
public class LocalEvento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocal;

    private String nome;

    private String endereco;

    private Integer capacidade;

    public LocalEvento(){}

}
