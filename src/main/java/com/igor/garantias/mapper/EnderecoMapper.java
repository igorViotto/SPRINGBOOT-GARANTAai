package com.igor.garantias.mapper;

import com.igor.garantias.dto.response.EnderecoResponse;
import com.igor.garantias.entity.Endereco;

public class EnderecoMapper {

    public static Endereco toEntity(EnderecoResponse dto, String numero){

        Endereco enderecoCompleto = new Endereco();
        enderecoCompleto.setLogradouro(dto.getLogradouro());
        enderecoCompleto.setBairro(dto.getBairro());
        enderecoCompleto.setLocalidade(dto.getLocalidade());
        enderecoCompleto.setUf(dto.getUf());
        enderecoCompleto.setCep(dto.getCep());
        enderecoCompleto.setNumero(numero);

        return enderecoCompleto;
    }
}
