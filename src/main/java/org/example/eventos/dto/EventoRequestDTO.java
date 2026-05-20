package org.example.eventos.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EventoRequestDTO(

        //TODO: colocar validações de entrada de dados
        @NotBlank(message = "O evento deve conter um nome")
        String nome,

        @NotBlank(message = "O evento deve conter uma descricao")
        String descricao,

        LocalDate dataEvento,

        @NotNull(message = " O ingresso deve conter um valor")
        Double valorIngresso,

        Long localId
) {
}
