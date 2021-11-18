package com.bancopt.utilizadores;

import com.bancopt.contas.Conta;
import com.bancopt.utilizadores.dados.Contacto;
import com.bancopt.utilizadores.dados.Morada;
import com.bancopt.utilizadores.dados.Nacionalidade;
import java.time.LocalDate;
import java.util.List;

/**
 * Classe que define atributos para cliente
 */
public class Cliente extends Utilizador {

    private List<Conta> listContas;

    public Cliente() {
        
    }
    
    public Cliente(List<Conta> listContas, String nome, LocalDate dataNascimento, Morada morada, Nacionalidade nacionalidade, Contacto contacto, String nif, TipoUtilizadorEnum tipoUtilizador) {
        super(nome, dataNascimento, morada, nacionalidade, contacto, nif, tipoUtilizador);
        this.listContas = listContas;
    }

    public List<Conta> getListContas() {
        return listContas;
    }

    public void setListContas(List<Conta> listContas) {
        this.listContas = listContas;
    }    
    
}
