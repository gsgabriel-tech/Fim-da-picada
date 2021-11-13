package com.fimdapicada.backend.dto;

import java.io.Serializable;
import java.util.Date;

import com.fimdapicada.backend.entities.relatorio;

public class RelatorioDTO implements Serializable{ 
		
	    private static final long serialVersionUID =1L;
	
	    
	    private Integer id;
		private String nome_empresa;
		private Date data;
		private String descricao;
		
		
		
		public RelatorioDTO() {
			super();
		}



		public RelatorioDTO(Integer id, String nome_empresa, Date data, String denuncia,
				String descricao) {
			super();
			this.id = id;
			this.nome_empresa = nome_empresa;			
			this.data = data;
			this.descricao = descricao;
		}

		public RelatorioDTO(relatorio entity) {
			super();
			this.id = entity.getId();
			this.nome_empresa = entity.getNome_empresa();
			this.data = entity.getData();
			this.descricao = entity.getDescricao();
		}



		public Integer getId() {
			return id;
		}



		public void setId(Integer id) {
			this.id = id;
		}



		public String getNome_empresa() {
			return nome_empresa;
		}



		public void setNome_empresa(String nome_empresa) {
			this.nome_empresa = nome_empresa;
		}



		public Date getData() {
			return data;
		}



		public void setData(Date data) {
			this.data = data;
		}



		public String getDescricao() {
			return descricao;
		}



		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
}