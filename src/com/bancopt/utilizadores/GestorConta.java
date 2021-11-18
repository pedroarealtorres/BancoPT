package com.bancopt.utilizadores;

import com.bancopt.contas.Conta;
import com.bancopt.utilizadores.dados.Contacto;
import com.bancopt.utilizadores.dados.Morada;
import com.bancopt.utilizadores.dados.Nacionalidade;
import java.time.LocalDate;
import java.util.List;

/**
 * Classe que define atributos para gestor de conta
 */
public class GestorConta extends Utilizador {

    private List<Cliente> listClientes;

    public GestorConta() {
    }

    public GestorConta(List<Cliente> listClientes, String nome, LocalDate dataNascimento, Morada morada, Nacionalidade nacionalidade, Contacto contacto, String nif, TipoUtilizadorEnum tipoUtilizador) {
        super(nome, dataNascimento, morada, nacionalidade, contacto, nif, tipoUtilizador);
        this.listClientes = listClientes;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    
}
