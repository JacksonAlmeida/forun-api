package com.sunflower.forun.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunflower.forun.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	List<Curso> findByNome(String nome);

}
