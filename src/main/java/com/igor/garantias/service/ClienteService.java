package com.igor.garantias.service;

import com.igor.garantias.ViaCepClient;
import com.igor.garantias.dto.response.ClienteResponse;
import com.igor.garantias.dto.response.EnderecoResponse;
import com.igor.garantias.entity.Cliente;
import com.igor.garantias.entity.Endereco;
import com.igor.garantias.mapper.EnderecoMapper;
import com.igor.garantias.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    public ClienteRepository clienteRepository;

    @Autowired
    public ViaCepClient viaCepClient;

    public Cliente salvarCliente(Cliente cliente){
        String cep = cliente.getEndereco().getCep();

        EnderecoResponse enderecoDTO = ViaCepClient.buscarEnderecoPorCep(cep);

        Endereco enderecoCompleto = EnderecoMapper.toEntity(
                enderecoDTO,
                cliente.getEndereco().getNumero()
        );

        cliente.setEndereco(enderecoCompleto);
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(String id){
        return clienteRepository.findById(id);
    }

    public List<ClienteResponse> listarTodosClientes() {
        return clienteRepository.findAll().stream()
                .map(cliente -> new ClienteResponse(
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getGarantia()
                ))
                .toList();
    }

}
