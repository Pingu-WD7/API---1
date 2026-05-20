package org.example.eventos.dto;

import jakarta.validation.constraints.NotBlank;

public record InscricaoRequestDTO(

        @NotBlank(message = "O campo do nome do Participante deve ser preenchido")
        String nomeParticipante,
        @NotBlank(message = "O campo do email do Participante deve ser preenchido")
        String emailParticipante,
        @NotBlank(message = "O campo Status n pode estar em branco")
        String status
) {

}
