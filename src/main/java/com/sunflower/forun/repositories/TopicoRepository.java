package com.sunflower.forun.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunflower.forun.entities.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByTitulo(String titulo);

}