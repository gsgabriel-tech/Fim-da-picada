package com.fimdapicada.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fimdapicada.backend.services.OrgaoCompetenteService;

@RestController
@RequestMapping(value="/OrgaoCompetente")
public class OrgaoCompetenteController {
	
	@Autowired
	private OrgaoCompetenteService service;
	
	
	
	
	
	
}
