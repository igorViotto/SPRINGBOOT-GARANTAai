package com.igor.garantias.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "enderecos")
public class Endereco {

    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;
    private String cep;
    private String numero;

    public String getLogradouro() {return logradouro;}

    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public String getBairro() {return bairro;}

    public void setBairro(String bairro) {this.bairro = bairro;}

    public String getLocalidade() {return localidade;}

    public void setLocalidade(String localidade) {this.localidade = localidade;}

    public String getUf() {return uf;}

    public void setUf(String uf) {this.uf = uf;}

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}

    public String getNumero() {return numero;}

    public void setNumero(String numero) {this.numero = numero;}
}
