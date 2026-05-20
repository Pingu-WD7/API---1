package org.example.eventos.model;

import jakarta.persistence.*;

public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInscricao;

    private String nomeParticipante;

    //pode-se usar o @Email para validar no DTO!
    private String emailParticipante;

    private String status;


    public Inscricao(){}
    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Evento evento;
    //TODO: transformar em entidade e colocar relacionamento

}
