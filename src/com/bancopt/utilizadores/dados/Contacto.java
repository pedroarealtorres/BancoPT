package com.bancopt.utilizadores.dados;

/**
 * Classe que define atributos para contacto
 */
public class Contacto {

    private int indicativoPais;
    private int numTelemovel;
    private String email;

    public Contacto(int indicativoPais, int numTelemovel, String email) {
        this.indicativoPais = indicativoPais;
        this.numTelemovel = numTelemovel;
        this.email = email;
    }
    
}
