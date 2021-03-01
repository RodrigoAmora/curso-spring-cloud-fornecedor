package br.com.rodrigoamora.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rodrigoamora.fornecedor.model.InfoFornecedor;
import br.com.rodrigoamora.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository; 

	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}	

}
