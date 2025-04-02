package com.example.felipejose.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.felipejose.entity.Curso;
import com.example.felipejose.repository.CursoRepository;

//Serviço para manipular dados de Curso
@Service
public class CursoService {
 private final CursoRepository repository;

 public CursoService(CursoRepository repository) {
     this.repository = repository;
 }

 public List<Curso> listarTodos() {
     return repository.findAll();
 }
}
