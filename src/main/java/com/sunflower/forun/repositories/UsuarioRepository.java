package com.sunflower.forun.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunflower.forun.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findByNome(String nome);

}
