package com.sunflower.forun.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.forun.entities.Usuario;
import com.sunflower.forun.service.UsuarioService;

@RestController
@RequestMapping(value = "/api/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(String nome) {
		List<Usuario> obj = usuarioService.findAll(nome);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario obj = usuarioService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
