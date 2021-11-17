package com.bancopt.utilizadores;

import com.bancopt.contas.Conta;
import com.bancopt.utilizadores.dados.Contacto;
import com.bancopt.utilizadores.dados.Morada;
import com.bancopt.utilizadores.dados.Nacionalidade;
import java.util.Date;
import java.util.List;

/**
 * Classe que define atributos para gestor de conta
 */
public class GestorConta extends Utilizador {

    private List<Conta> listClientes;

    public GestorConta(List<Conta> listClientes, String nome, Date dataNascimento, Morada morada, Nacionalidade nacionalidade, Contacto contacto, String nif, TipoUtilizadorEnum tipoUtilizador) {
        super(nome, dataNascimento, morada, nacionalidade, contacto, nif, tipoUtilizador);
        this.listClientes = listClientes;
    }

    
}
