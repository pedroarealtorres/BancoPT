package com.bancopt.dadosApp;

import com.bancopt.operacoes.Operacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pedro.torres
 */
public class Operacoes {
    
    private String nome;
    private Double montante;
    private Date dataOperacao;
    private int ibanDestino;
    
    enum TipoOperacaoEnum {
        Depósito,
        Levantamento,
        Transferência
    }
    
    public static final double RANGE_MIN = 0.0;
    public static final double RANGE_MAX = 100.0;            
            
    public static List<Operacao> gerarOperacoes(int numOperacoes) {
        
        List<Operacao> listOperacoes = new ArrayList<>();
        
        for(int i = 0; i < numOperacoes; i ++) {
            Operacao op = new Operacao();
            
            op.setNome("Operação " + i);
            //op.setTipo(TipoOperacaoEnum.values().);
            
            Random r = new Random();
            double montante = RANGE_MIN + (RANGE_MAX - RANGE_MIN) * r.nextDouble();
            
            
        }
        
        return listOperacoes;
    }
}
