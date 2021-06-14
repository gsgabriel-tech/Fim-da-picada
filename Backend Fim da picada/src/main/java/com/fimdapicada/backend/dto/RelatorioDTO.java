package com.fimdapicada.backend.dto;

import java.io.Serializable;
import java.util.Date;

import com.fimdapicada.backend.entities.relatorio;

public class RelatorioDTO implements Serializable{ 
		
	    private static final long serialVersionUID =1L;
	
	    
	    private Integer id;
		private String nome_empresa;
		private Date data_inicio;
		private Date data_termino;
		private String descricao;
		
		
		
		public RelatorioDTO() {
			super();
		}



		public RelatorioDTO(Integer id, String nome_empresa, Date data_inicio, Date data_termino, String denuncia,
				String descricao) {
			super();
			this.id = id;
			this.nome_empresa = nome_empresa;
			this.data_inicio = data_inicio;
			this.data_termino = data_termino;
			this.descricao = descricao;
		}

		public RelatorioDTO(relatorio entity) {
			super();
			this.id = entity.getId();
			this.nome_empresa = entity.getNome_empresa();
			this.data_inicio = entity.getData_inicio();
			this.data_termino = entity.getData_termino();
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



		public Date getData_inicio() {
			return data_inicio;
		}



		public void setData_inicio(Date data_inicio) {
			this.data_inicio = data_inicio;
		}



		public Date getData_termino() {
			return data_termino;
		}



		public void setData_termino(Date data_termino) {
			this.data_termino = data_termino;
		}

		public String getDescricao() {
			return descricao;
		}



		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
			
		
}