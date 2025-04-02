package com.example.felipejose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.felipejose.entity.Curso;
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
