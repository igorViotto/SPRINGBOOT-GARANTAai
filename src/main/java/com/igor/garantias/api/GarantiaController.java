package com.igor.garantias.api;

import com.igor.garantias.dto.request.GarantiaRequest;
import com.igor.garantias.dto.response.GarantiaResponse;
import com.igor.garantias.entity.Cliente;
import com.igor.garantias.entity.Garantia;
import com.igor.garantias.mapper.GarantiaMapper;
import com.igor.garantias.service.ClienteService;
import com.igor.garantias.service.GarantiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class GarantiaController {

    @Autowired
    public GarantiaService garantiaService;

    @Autowired
    public ClienteService clienteService;

    @PostMapping("/{id}/criar-garantia")
    public ResponseEntity<GarantiaResponse> salvarGarantia(@PathVariable String id, @RequestBody GarantiaRequest garantiaRequest){
        Optional<Cliente> clienteOptional = clienteService.buscarClientePorId(id);

        if (clienteOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        Garantia garantia = GarantiaMapper.toEntity(garantiaRequest);
        garantia.setCliente(clienteOptional.get());

        Garantia garantiaSalva = garantiaService.salvarGarantia(garantia);
        GarantiaResponse response  = GarantiaMapper.toResponse(garantiaSalva);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<GarantiaResponse> buscarGarantia(@PathVariable String id){
        GarantiaResponse response = garantiaService.buscarGarantiaPorId(id);
        return ResponseEntity.ok(response);
    }

}
