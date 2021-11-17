package com.bancopt.utilizadores.dados;

/**
 * Classe que define os atributos para nacionalidade
 */
public class Nacionalidade {
    
    SiglaPaisEnum siglaPais;
    PaisEnum pais;

    public Nacionalidade(SiglaPaisEnum siglaPais, PaisEnum pais) {
        this.siglaPais = siglaPais;
        this.pais = pais;
    }
    
    
}
