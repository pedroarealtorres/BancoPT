package com.bancopt.operacoes;

import java.time.LocalDate;

/**
 * Operação de uma conta
 */
public class Operacao {
    
    private String nome;
    private TipoOperacaoEnum tipo;
    private Double montante;
    private LocalDate dataOperacao;
    private String ibanDestino;

    public Operacao() {
    }

    public Operacao(String nome, TipoOperacaoEnum tipo, Double montante, LocalDate dataOperacao, String ibanDestino) {
        this.nome = nome;
        this.tipo = tipo;
        this.montante = montante;
        this.dataOperacao = dataOperacao;
        this.ibanDestino = ibanDestino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoOperacaoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoOperacaoEnum tipo) {
        this.tipo = tipo;
    }

    public Double getMontante() {
        return montante;
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }

    public LocalDate getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(LocalDate dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getIbanDestino() {
        return ibanDestino;
    }

    public void setIbanDestino(String ibanDestino) {
        this.ibanDestino = ibanDestino;
    }

    
}
