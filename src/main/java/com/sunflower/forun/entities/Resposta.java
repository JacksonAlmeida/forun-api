package com.sunflower.forun.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Resposta implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String mensagem;
	private Topico topico;
	private Instant dataCriacao;
	private Usuario ususario;
	private Boolean solucao = false;
	
	public Resposta() {
		
	}

	public Resposta(Long id, String mensagem, Topico topico, Instant dataCriacao, Usuario ususario, Boolean solucao) {
		this.id = id;
		this.mensagem = mensagem;
		this.topico = topico;
		this.dataCriacao = dataCriacao;
		this.ususario = ususario;
		this.solucao = solucao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Topico getTopico() {
		return topico;
	}

	public void setTopico(Topico topico) {
		this.topico = topico;
	}

	public Instant getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Usuario getUsusario() {
		return ususario;
	}

	public void setUsusario(Usuario ususario) {
		this.ususario = ususario;
	}

	public Boolean getSolucao() {
		return solucao;
	}

	public void setSolucao(Boolean solucao) {
		this.solucao = solucao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resposta other = (Resposta) obj;
		return Objects.equals(id, other.id);
	}
}
