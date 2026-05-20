package org.example.eventos.service;

import org.example.eventos.dto.InscricaoRequestDTO;
import org.example.eventos.dto.InscricaoResponseDTO;
import org.example.eventos.exception.RecursoNaoEncontradoException;
import org.example.eventos.model.Evento;
import org.example.eventos.model.Inscricao;
import org.example.eventos.repository.EventoRepository;
import org.example.eventos.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscricaoService {


    private final InscricaoRepository repository;

    public InscricaoService(InscricaoRepository repository) {
        this.repository = repository;
    }

    public List<InscricaoResponseDTO> listarTodas() {
        return repository.findAll()
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    public InscricaoResponseDTO buscarPorId(Long id) {
        Inscricao inscricao = repository.findById(id)
                .orElseThrow(() -> new RecursoNaoEncontradoException("Inscrição não encontrada"));

        return converterParaResponse(inscricao);
    }

    public InscricaoResponseDTO cadastrar(InscricaoRequestDTO dto) {
        Evento evento = repository.findById(dto.idEvento).orElseThrow() -> RecursoNaoEncontradoException (" "))
                //TODO: adicionar a exception

        Inscricao inscricao = new Inscricao();

        inscricao.setNomeParticipante(dto.nomeParticipante);
        inscricao.setEmailParticipante(dto.emailParticipante);
        inscricao.setStatus(dto.status);
        inscricao.setEvento(dto.evento);

        Inscricao salva = inscricao.save(inscricao);

        return converterParaResponse(salva);
    }

    public InscricaoResponseDTO atualizar(Long id, InscricaoRequestDTO dto) {
        Inscricao inscricao = repository.findById(id).orElseThrow(() -> new RuntimeException(" Inscricao n encontrada"));
                //TODO: adicionar a exception

        Evento evento = eventoRepository.findById(dto.eventoId());
                //TODO: adicionar a exception

        inscricao.setNomeParticipante(dto.nomeParticipante());
        inscricao.setEmailParticipante(dto.emailParticipante());
        inscricao.setStatus(dto.status());
        inscricao.setEvento(evento);

        Inscricao atualizada = inscricaoRepository.save(inscricao);

        return converterParaResponse(atualizada);
    }

    public void deletar(Long id) {
        Inscricao inscricao = inscricaoRepository.findById(id);
                    //TODO: adicionar a exception

        //TODO: chamar método de deletar do repository
    }

    public List<InscricaoResponseDTO> listarPorEvento(Long idEvento) {
        return InscricaoResponseDTO.findByEventoId(idEvento)
                .stream()
                .map(this::converterParaResponse)
                .toList();
    }

    private InscricaoResponseDTO converterParaResponse(Inscricao inscricao) {
        return new InscricaoResponseDTO(
                //TODO: fazer os gets de "inscricao" conforme o que deve aparecer no response

        );
    }
}