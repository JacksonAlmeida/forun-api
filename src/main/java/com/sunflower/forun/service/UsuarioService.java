package com.sunflower.forun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.forun.entities.Usuario;
import com.sunflower.forun.repositories.UsuarioRepository;
import com.sunflower.forun.service.exception.ResourceNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> findAll(String nome) {
		if (nome == null) {
			List<Usuario> list = usuarioRepository.findAll();
			return list;
		} else {
			List<Usuario> list = usuarioRepository.findByNome(nome);
			return list;
		}
	}

	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
