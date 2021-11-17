package com.bancopt.dadosApp;

import com.bancopt.utilizadores.Utilizador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pedro.torres
 */
public class Utilizadores {
    
    private String nomesProprios[] = new String[] { "Pedro", "Nelson", "António", "Carlos", "Henrique" };
    private String apelidos[] = new String[] { "Torres", "Silva", "Mourão", "Amorim", "Rocha" };
   
    private static final int NUM_UTILIZADORES = 5;
    private static final Date DATA_INICIO = new Date(1900, 01, 01);
    private static final Date DATA_FIM = new Date();
    /*   
    Morada morada;
    Nacionalidade nacionalidade;
    Contacto contacto;
    String nif;    
    */
    
    public List<Utilizador> gerarUtilizadores() {
        
        List<Utilizador> listUtilizadores = new ArrayList<Utilizador>();
        String[] nomes = gerarNomes(nomesProprios, apelidos);
        
        
        return null;
    }
    
    /**
     * Método para gerar nomes
     */
    private static String[] gerarNomes(String[] nomesProprios, String[] apelidos) {
        //Instancia classe Random
        Random r = new Random();
        int r_nomeProp = r.nextInt(4);
        int r_apelidos = r.nextInt(4);
        
        String nomes[] = new String[NUM_UTILIZADORES]; 
        
        for(int i = 0; i < NUM_UTILIZADORES; i++) {
            nomes[i] = nomesProprios[r_nomeProp] + " " + apelidos[r_apelidos];
        }
        return nomes;
    }

    /**
     * Método para gerar datas
     */
    public static Date gerarDatas(Date dataInicio, Date dataFim) {
        long dataStart = dataInicio.getTime();
        long dataEnd = dataFim.getTime();
        long dataRandom = ThreadLocalRandom
          .current()
          .nextLong(dataStart, dataEnd);

        return new Date(dataRandom);
    }
    
    
}
