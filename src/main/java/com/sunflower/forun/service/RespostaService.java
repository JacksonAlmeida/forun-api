package com.sunflower.forun.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunflower.forun.entities.Resposta;
import com.sunflower.forun.repositories.RespostaRepository;
import com.sunflower.forun.service.exception.ResourceNotFoundException;

@Service
public class RespostaService {

	@Autowired
	private RespostaRepository respostaRepository;

	public List<Resposta> findAll() {
		List<Resposta> list = respostaRepository.findAll();
		return list;
	}

	public Resposta findById(Long id) {
		Optional<Resposta> obj = respostaRepository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
