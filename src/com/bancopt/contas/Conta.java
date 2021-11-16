package com.bancopt.contas;

import com.bancopt.operacoes.Operacao;
import java.util.List;

/**
 * Dados de uma conta bancária
 */
public class Conta {
    
    int numConta;
    TipoContaEnum tipoConta;
    String nome;
    int iban;
    double montante;
    double rentabilidade;
    List<Operacao> listOperacoes;
    
}
