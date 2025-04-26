package com.igor.garantias.dto.response;

import com.igor.garantias.entity.Garantia;

import java.util.List;

public class ClienteResponse {

    private String id;
    private String nome;
    private List<Garantia> garantia;

    public ClienteResponse(){}

    public ClienteResponse(String id, String nome, List<Garantia> garantia){
        this.id = id;
        this.nome = nome;
        this.garantia = garantia;
    }

    public String getId() {return id;}

    public String getNome() {return nome;}

    public List<Garantia> getGarantia() {return garantia;}

}
