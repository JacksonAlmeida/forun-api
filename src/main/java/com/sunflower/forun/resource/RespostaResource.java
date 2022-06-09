package com.sunflower.forun.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunflower.forun.entities.Resposta;
import com.sunflower.forun.service.RespostaService;

@RestController
@RequestMapping(value = "/api/respostas")
public class RespostaResource {

	@Autowired
	private RespostaService respostaService;
	
	@GetMapping
	public ResponseEntity<List<Resposta>> findAll(){
		List<Resposta> list = respostaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Resposta> findById(@PathVariable Long id){
		Resposta obj = respostaService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
