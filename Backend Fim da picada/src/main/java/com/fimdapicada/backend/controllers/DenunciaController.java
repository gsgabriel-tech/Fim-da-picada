package com.fimdapicada.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fimdapicada.backend.dto.DenunciaDTO;
import com.fimdapicada.backend.services.DenunciaService;

@RestController
@RequestMapping(value="/denuncia")
public class DenunciaController {
	
	@Autowired
	private DenunciaService service;
	
	@PostMapping
	public ResponseEntity<DenunciaDTO> insert(@RequestBody DenunciaDTO denunciaDTO){
		denunciaDTO = service.insert(denunciaDTO);
		return ResponseEntity.ok() .body(denunciaDTO);
	}

}
