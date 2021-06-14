package com.fimdapicada.backend.repositories;

//camada de acesso a dados que conversa com as entidades

import org.springframework.data.jpa.repository.JpaRepository;

import com.fimdapicada.backend.entities.orgaocompetente;

public interface OrgaocompetenteRepository extends JpaRepository<orgaocompetente, Integer> {
	
	
	
	
}
