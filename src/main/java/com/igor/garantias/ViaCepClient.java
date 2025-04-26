package com.igor.garantias;

import com.igor.garantias.dto.response.EnderecoResponse;
import com.igor.garantias.exception.CepNaoEncontradoException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepClient {

    private static final RestTemplate restTemplate = new RestTemplate();

    public static EnderecoResponse buscarEnderecoPorCep(String cep){
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        ResponseEntity<EnderecoResponse> response = restTemplate.getForEntity(url, EnderecoResponse.class);
        EnderecoResponse endereco = response.getBody();

        if (endereco == null || endereco.getCep() == null) {
            throw new CepNaoEncontradoException("CEP inválido ou não encontrado: " + cep);
        }

        return endereco;
    }
}
