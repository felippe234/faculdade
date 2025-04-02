package com.example.felipejose.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.felipejose.entity.Estudante;
import com.example.felipejose.service.EstudanteService;

@RestController
@RequestMapping("/api/estudantes")
public class EstudanteController {
    private final EstudanteService service;

    public EstudanteController(EstudanteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estudante> listarTodos() {
        return service.listarTodos();
    }
}
