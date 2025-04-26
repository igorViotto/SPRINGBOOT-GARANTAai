package com.igor.garantias.service;

import com.igor.garantias.dto.response.GarantiaResponse;
import com.igor.garantias.entity.Cliente;
import com.igor.garantias.entity.Garantia;
import com.igor.garantias.mapper.GarantiaMapper;
import com.igor.garantias.repository.ClienteRepository;
import com.igor.garantias.repository.GarantiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GarantiaService {

    @Autowired
    public GarantiaRepository garantiaRepository;

    @Autowired
    public ClienteRepository clienteRepository;

    public Garantia salvarGarantia(Garantia garantia){
        return garantiaRepository.save(garantia);
    }

    public GarantiaResponse buscarGarantiaPorId(String id){
        Garantia garantia = garantiaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Garantia não encontrada"));

        Cliente cliente = clienteRepository.findById(garantia.getCliente().getId())
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));


        return GarantiaMapper.toResponse(garantia);
    }

}
