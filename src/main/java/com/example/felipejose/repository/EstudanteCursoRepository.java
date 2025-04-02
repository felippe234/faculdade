package com.example.felipejose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.felipejose.entity.EstudanteCurso;
@Repository
public interface EstudanteCursoRepository extends JpaRepository<EstudanteCurso, Long> {
}
