package com.sunflower.forun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.forun.entities.Curso;
import com.sunflower.forun.repositories.CursoRepository;
import com.sunflower.forun.service.exception.ResourceNotFoundException;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;
	
	public List<Curso> findAll(String nome){
		if(nome == null) {
			List<Curso> list = cursoRepository.findAll();
			return list;
		}
		else {
			List<Curso> list = cursoRepository.findByNome(nome);
			System.out.println(nome);
			return list;
		}
	}

	public Curso findById(Long id) {
		Optional<Curso> obj = cursoRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
}
