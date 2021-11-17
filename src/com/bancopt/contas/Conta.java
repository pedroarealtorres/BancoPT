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

    public Conta(int numeroConta, TipoContaEnum tipoConta, String nomeConta, String iban, double montante, List<Operacao> listOperacoes) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.nomeConta = nomeConta;
        this.iban = iban;
        this.montante = montante;
        this.listOperacoes = listOperacoes;
    }
    
    
}
