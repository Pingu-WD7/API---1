package org.example.eventos.dto;

public record LocalEventoResponseDTO (
         Long idLocal,
         String nome,
         String endereco,
         Integer capacidade
){
}
