package com.example.felipejose.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.felipejose.entity.EstudanteCurso;
import com.example.felipejose.repository.EstudanteCursoRepository;

//Serviço para manipular dados de EstudanteCurso
@Service
public class EstudanteCursoService {
 private final EstudanteCursoRepository repository;

 public EstudanteCursoService(EstudanteCursoRepository repository) {
     this.repository = repository;
 }

 public List<EstudanteCurso> listarTodas() {
     return repository.findAll();
 }
}