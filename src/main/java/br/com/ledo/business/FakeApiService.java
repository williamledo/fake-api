package br.com.ledo.business;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ledo.apiv1.dto.ProductsDTO;
import br.com.ledo.infra.FakeApiClient;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FakeApiService {

	private final FakeApiClient cliente;
	
	public List<ProductsDTO> buscaProdutos() {
		return cliente.buscaListaProdutos();
	}
	
}
