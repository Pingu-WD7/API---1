package org.example.eventos.service;

import org.example.eventos.repository.EventoRepository;

public class EventoService {

    private EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }
}
