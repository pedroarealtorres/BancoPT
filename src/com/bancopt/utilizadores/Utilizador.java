package com.bancopt.utilizadores;

import com.bancopt.utilizadores.dados.Morada;
import com.bancopt.utilizadores.dados.Nacionalidade;
import com.bancopt.utilizadores.dados.Contacto;
import java.util.Date;

/**
 * Tipo de utilizador
 */
public class Utilizador {
    
    private String nome;
    private Date dataNascimento;
    private Morada morada;
    private Nacionalidade nacionalidade;
    private Contacto contacto;
    private String nif;
    private TipoUtilizadorEnum tipoUtilizador;

    public Utilizador(String nome, Date dataNascimento, Morada morada, Nacionalidade nacionalidade, Contacto contacto, String nif, TipoUtilizadorEnum tipoUtilizador) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.contacto = contacto;
        this.nif = nif;
        this.tipoUtilizador = tipoUtilizador;
    }
    
    
    
}

