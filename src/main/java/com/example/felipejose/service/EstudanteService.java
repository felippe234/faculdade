package com.example.felipejose.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.felipejose.entity.Estudante;
import com.example.felipejose.repository.EstudanteRepository;

// Serviço para manipular dados de Estudante
@Service
public class EstudanteService {
    private final EstudanteRepository repository;

    public EstudanteService(EstudanteRepository repository) {
        this.repository = repository;
    }

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }
}