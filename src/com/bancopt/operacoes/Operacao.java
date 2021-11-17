package com.bancopt.operacoes;

import java.util.Date;

/**
 * Operação de uma conta
 */
public class Operacao {
    
    private String nome;
    private TipoOperacaoEnum tipo;
    private Double montante;
    private Date dataOperacao;
    private int ibanDestino;

    public Operacao() {
    }

    public Operacao(String nome, TipoOperacaoEnum tipo, Double montante, Date dataOperacao, int ibanDestino) {
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

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(Date dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public int getIbanDestino() {
        return ibanDestino;
    }

    public void setIbanDestino(int ibanDestino) {
        this.ibanDestino = ibanDestino;
    }

    
}
