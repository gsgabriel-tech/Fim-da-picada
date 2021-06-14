package com.fimdapicada.backend.entities;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="tb_relatorio")
public class relatorio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome_empresa;
	private Date data_inicio;
	private Date data_termino;
	
	private String descricao;
	
	/*@ManyToOne
	@JoinColumn(name="id_orgaocompetente", referencedColumnName="id")
	private  orgaocompetente orgaocompetente;
	
	@OneToMany(mappedBy = "relatorio")
	private List<denuncia> denuncia;*/
	
	public relatorio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public relatorio(Integer id, String nome_empresa, Date data_inicio, Date data_termino, String denuncia,
			String descricao) {
		super();
		this.id = id;
		this.nome_empresa = nome_empresa;
		this.data_inicio = data_inicio;
		this.data_termino = data_termino;
		this.descricao = descricao;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		relatorio other = (relatorio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}


