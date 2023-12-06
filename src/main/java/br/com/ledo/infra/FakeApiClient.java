package br.com.ledo.infra;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ledo.apiv1.dto.ProductsDTO;

@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {

	@GetMapping("/products")
	List<ProductsDTO> buscaListaProdutos();
	
}
