package com.example.felipejose.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.felipejose.entity.EstudanteCurso;
import com.example.felipejose.service.EstudanteCursoService;

@RestController
@RequestMapping("/api/inscricoes")
public class EstudanteCursoController {
    private final EstudanteCursoService service;

    public EstudanteCursoController(EstudanteCursoService service) {
        this.service = service;
    }

    @GetMapping
    public List<EstudanteCurso> listarTodas() {
        return service.listarTodas();
    }
}
