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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="tb_relatorio")
public class relatorio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome_empresa;
	private Date data;

	
	private String descricao;
	
	@OneToMany(mappedBy = "relatorio")
	private List<denuncia> denuncia;
	
	public relatorio() {
		super();
	
	}
	public relatorio(Integer id, String nome_empresa, Date data,String denuncia,
			String descricao) {
		super();
		this.id = id;
		this.nome_empresa = nome_empresa;
		this.data = data;
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
	public List<denuncia> getDenuncia() {
		return denuncia;
	}
	public void setDenuncia(List<denuncia> denuncia) {
		this.denuncia = denuncia;
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


