package com.sunflower.forun.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.forun.dto.TopicoDTO;
import com.sunflower.forun.entities.Topico;
import com.sunflower.forun.service.TopicoService;

@RestController
@RequestMapping(value = "/api/topicos")
public class TopicoResource {

	@Autowired
	private TopicoService topicoService;

	@GetMapping
	public ResponseEntity<List<TopicoDTO>> findAll(String titulo) {
		List<TopicoDTO> list = topicoService.findAll(titulo);
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Topico> findById(@PathVariable Long id) {
		Topico obj = topicoService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
