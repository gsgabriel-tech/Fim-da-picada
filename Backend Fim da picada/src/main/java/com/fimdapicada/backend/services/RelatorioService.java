package com.fimdapicada.backend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fimdapicada.backend.dto.RelatorioDTO;
import com.fimdapicada.backend.entities.relatorio;
import com.fimdapicada.backend.repositories.RelatorioRepository;

@Service
public class RelatorioService {
	
	   @Autowired
		private RelatorioRepository repository;
	   
	   @Transactional(readOnly = true)	   
	   public List< RelatorioDTO> findALL() {		   
		   List<relatorio> lista = repository.findAll();
		   List<RelatorioDTO> listaDTO = new ArrayList<RelatorioDTO>();
		   
		   for (int i = 0; i < lista.size(); i++) {
			   RelatorioDTO temp = new RelatorioDTO(lista.get(i));						
				listaDTO.add(temp);
				
			}
			return listaDTO;
		   
		   
	   }
	   
	 public RelatorioDTO findId(Integer id) {
           Optional<relatorio> relatorio = repository.findById(id);
           RelatorioDTO relatorioDTO = new RelatorioDTO(relatorio.get());
           return relatorioDTO; 
	   }
    
		
}