package com.igor.garantias.mapper;

import com.igor.garantias.dto.request.GarantiaRequest;
import com.igor.garantias.dto.response.GarantiaResponse;
import com.igor.garantias.entity.Garantia;

public class GarantiaMapper {

    public static Garantia toEntity(GarantiaRequest request){
        Garantia garantia = new Garantia();

        garantia.setTipo(request.getTipo());
        garantia.setModelo(request.getModelo());
        garantia.setEstadoConservacao(request.getEstadoConservacao());
        garantia.setAnoEmUso(request.getAnoEmUso());
        garantia.setValorBem(request.getValorBem());
        garantia.setBemQuitado(request.isBemQuitado());
        garantia.setDocumentacaoEmDia(request.isDocumentacaoEmDia());

        return garantia;
    }

    public static GarantiaResponse toResponse(Garantia garantia){
        GarantiaResponse response = new GarantiaResponse();

        if (garantia.getCliente() != null) {
            response.setIdCliente(garantia.getCliente().getId());
            response.setNomeCliente(garantia.getCliente().getNome());
        }

        response.setTipo(garantia.getTipo());
        response.setModelo(garantia.getModelo());
        response.setEstadoConservacao(garantia.getEstadoConservacao());
        response.setAnoEmUso(garantia.getAnoEmUso());
        response.setValorBem(garantia.getValorBem());
        response.setBemQuitado(garantia.isBemQuitado());
        response.setDocumentacaoEmDia(garantia.isDocumentacaoEmDia());

        return response;
    }

}
