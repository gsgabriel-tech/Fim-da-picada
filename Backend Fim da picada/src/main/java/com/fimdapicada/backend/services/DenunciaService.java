package com.fimdapicada.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fimdapicada.backend.dto.DenunciaDTO;
import com.fimdapicada.backend.entities.denuncia;
import com.fimdapicada.backend.repositories.DenunciaRepository;

@Service
public class DenunciaService {
       
	@Autowired
	private DenunciaRepository repository;
	
	@Transactional(readOnly = true)
	
	public DenunciaDTO  insert(DenunciaDTO denunDto ) {	
		denuncia denuncia = new denuncia(
				denunDto.getId(),
				denunDto.getDescricao(),
				denunDto.getNumero(),
				denunDto.getRua(),
				denunDto.getLogadouro(),
				denunDto.getComplemento(),
				denunDto.getBairro(),
				denunDto.getCep(),
				denunDto.getCidade(),
				denunDto.getEstado(),
				denunDto.getStatus(),
				denunDto.getProtocolo());
	
		
		denuncia = repository.save(denuncia);
		return new DenunciaDTO(denuncia);
	}
	
	
	
}