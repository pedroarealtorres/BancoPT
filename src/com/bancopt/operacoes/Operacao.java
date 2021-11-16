package com.bancopt.operacoes;

import java.util.Date;

/**
 * Operação de uma conta
 */
public class Operacao {
    
    String nome;
    TipoOperacaoEnum tipoOperacao;
    Double montante;
    Date dataOperacao;
    int ibanDestino;

}
