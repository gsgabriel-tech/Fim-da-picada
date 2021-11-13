package com.fimdapicada.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fimdapicada.backend.dto.RelatorioDTO;
import com.fimdapicada.backend.services.RelatorioService;

@RestController
@RequestMapping(value="/Relatorio")
public class RelatorioController  {
	
	@Autowired
	private RelatorioService service;

	@GetMapping
	public ResponseEntity<List<RelatorioDTO>> findall() {
		List<RelatorioDTO> listaFinal = service.findALL();
		return ResponseEntity.ok().body(listaFinal);
	}
		
	
	 @GetMapping(value = "/{id}")
     public ResponseEntity<RelatorioDTO> buscar(@PathVariable Integer id) {
		 RelatorioDTO relatorioDTO = service.findId(id);
        return ResponseEntity.ok().body(relatorioDTO);	

	 
	}	
	
}
