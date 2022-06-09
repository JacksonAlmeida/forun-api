package com.sunflower.forun.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.forun.entities.Curso;
import com.sunflower.forun.service.CursoService;

@RestController
@RequestMapping(value = "api/cursos")
public class CursoResource {

	@Autowired
	private CursoService cursoService;

	@GetMapping
	public ResponseEntity<List<Curso>> findAll(String nome) {
		List<Curso> list = cursoService.findAll(nome);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Curso> findById(@PathVariable Long id) {
		Curso obj = cursoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
