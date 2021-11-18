package com.bancopt.utilizadores;

import com.bancopt.utilizadores.dados.Morada;
import com.bancopt.utilizadores.dados.Nacionalidade;
import com.bancopt.utilizadores.dados.Contacto;
import java.time.LocalDate;

/**
 * Tipo de utilizador
 */
public class Utilizador {
    
    private String nome;
    private LocalDate dataNascimento;
    private Morada morada;
    private Nacionalidade nacionalidade;
    private Contacto contacto;
    private String nif;
    private TipoUtilizadorEnum tipoUtilizador;

    public Utilizador() {
    }

    public Utilizador(String nome, LocalDate dataNascimento, Morada morada, Nacionalidade nacionalidade, Contacto contacto, String nif, TipoUtilizadorEnum tipoUtilizador) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.morada = morada;
        this.nacionalidade = nacionalidade;
        this.contacto = contacto;
        this.nif = nif;
        this.tipoUtilizador = tipoUtilizador;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Morada getMorada() {
        return morada;
    }

    public void setMorada(Morada morada) {
        this.morada = morada;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public TipoUtilizadorEnum getTipoUtilizador() {
        return tipoUtilizador;
    }

    public void setTipoUtilizador(TipoUtilizadorEnum tipoUtilizador) {
        this.tipoUtilizador = tipoUtilizador;
    }

}

