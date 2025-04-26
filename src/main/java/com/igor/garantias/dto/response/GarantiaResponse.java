package com.igor.garantias.dto.response;

import java.math.BigDecimal;

public class GarantiaResponse {

    private String idCliente;
    private String nomeCliente;

    private String tipo;
    private String modelo;
    private String estadoConservacao;
    private int anoEmUso;
    private BigDecimal valorBem;
    private boolean bemQuitado;
    private boolean documentacaoEmDia;



    public String getIdCliente() {return idCliente;}
    public void setIdCliente(String idCliente) {this.idCliente = idCliente;}

    public String getNomeCliente() {return nomeCliente;}
    public void setNomeCliente(String nomeCliente) {this.nomeCliente = nomeCliente;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getEstadoConservacao() {return estadoConservacao;}
    public void setEstadoConservacao(String estadoConservacao) {this.estadoConservacao = estadoConservacao;}

    public int getAnoEmUso() {return anoEmUso;}
    public void setAnoEmUso(int anoEmUso) {this.anoEmUso = anoEmUso;}

    public BigDecimal getValorBem() {return valorBem;}
    public void setValorBem(BigDecimal valorBem) {this.valorBem = valorBem;}

    public boolean isBemQuitado() {return bemQuitado;}
    public void setBemQuitado(boolean bemQuitado) {this.bemQuitado = bemQuitado;}

    public boolean isDocumentacaoEmDia() {return documentacaoEmDia;}
    public void setDocumentacaoEmDia(boolean documentacaoEmDia) {this.documentacaoEmDia = documentacaoEmDia;}
}
