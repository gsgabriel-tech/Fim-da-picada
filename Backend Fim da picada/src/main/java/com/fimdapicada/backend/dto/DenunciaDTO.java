package com.fimdapicada.backend.dto;

import java.io.Serializable;

import com.fimdapicada.backend.entities.denuncia;

public class DenunciaDTO implements Serializable{
	
    private static final long serialVersionUID =1L;
	
    private Integer id;
	private String descricao;
	private String email;
	// private File foto; a resolver
	private Integer numero;
	private String rua;
	private String logadouro;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public DenunciaDTO() {
		super();
	}


	public DenunciaDTO(Integer id, String descricao, String email, Integer numero, String rua, String logadouro,
			String complemento, String bairro, String cep, String cidade, String estado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.email = email;
		this.numero = numero;
		this.rua = rua;
		this.logadouro = logadouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	public DenunciaDTO(denuncia entity) {
		super();
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
		this.email = entity.getEmail();
		this.numero = entity.getNumero();
		this.rua = entity.getRua();
		this.logadouro = entity.getLogadouro();
		this.complemento = entity.getComplemento();
		this.bairro = entity.getBairro();
		this.cep = entity.getCep();
		this.cidade = entity.getCidade();
		this.estado = entity.getEstado();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getNumero() {
		return numero;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getLogadouro() {
		return logadouro;
	}


	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
