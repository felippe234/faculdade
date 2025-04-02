package com.example.felipejose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.felipejose.entity.Estudante;

@Repository
public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
