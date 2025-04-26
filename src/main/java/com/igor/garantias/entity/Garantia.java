package com.igor.garantias.entity;
import java.math.BigDecimal;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "garantias")
public class Garantia {

    @Id
    private String id;
    private Cliente cliente;
    private String tipo;
    private String modelo;
    private String estadoConservacao;
    private int anoEmUso;
    private BigDecimal valorBem;
    private boolean bemQuitado;
    private boolean documentacaoEmDia;

}
