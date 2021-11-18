package com.bancopt.contas;

import com.bancopt.operacoes.Operacao;
import java.util.List;

/**
 * Dados de uma conta bancária
 */
public class Conta {
    
    private int numeroConta;
    private TipoContaEnum tipoConta;
    private String nomeConta;
    private String iban;
    private double montante;
    private List<Operacao> listOperacoes;

    public Conta() {
    }

    public Conta(int numeroConta, TipoContaEnum tipoConta, String nomeConta, String iban, double montante, List<Operacao> listOperacoes) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.nomeConta = nomeConta;
        this.iban = iban;
        this.montante = montante;
        this.listOperacoes = listOperacoes;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public TipoContaEnum getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoContaEnum tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeConta() {
        return nomeConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public List<Operacao> getListOperacoes() {
        return listOperacoes;
    }

    public void setListOperacoes(List<Operacao> listOperacoes) {
        this.listOperacoes = listOperacoes;
    }
    
    
    
}
