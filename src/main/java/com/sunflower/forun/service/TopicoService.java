package com.sunflower.forun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.forun.dto.TopicoDTO;
import com.sunflower.forun.entities.Topico;
import com.sunflower.forun.repositories.TopicoRepository;
import com.sunflower.forun.service.exception.ResourceNotFoundException;

@Service
public class TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;

	public List<TopicoDTO> findAll(String titulo) {
		if (titulo == null) {
			List<Topico> list = topicoRepository.findAll();
			return TopicoDTO.converter(list);
		} else {
			List<Topico> list = topicoRepository.findByTitulo(titulo);
			return TopicoDTO.converter(list);
		}
	}
	
	public Topico findById(Long id) {
		Optional<Topico> obj = topicoRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
