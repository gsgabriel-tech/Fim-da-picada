package com.fimdapicada.backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fimdapicada.backend.entities.denuncia;



public interface DenunciaRepository extends JpaRepository <denuncia, Integer> {
	
}
