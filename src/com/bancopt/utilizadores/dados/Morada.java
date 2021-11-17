package com.bancopt.utilizadores.dados;

/**
 * Classe que define atributos para morada
 */
public class Morada {
    
    private String rua;
    private DistritoEnum distrito;
    private String freguesia;
    private String concelho;
    private String codigoPostal;
    private String numPorta;// Lote X
    private String andar;

    public Morada(String rua, DistritoEnum distrito, String freguesia, String concelho, String codigoPostal, String numPorta, String andar) {
        this.rua = rua;
        this.distrito = distrito;
        this.freguesia = freguesia;
        this.concelho = concelho;
        this.codigoPostal = codigoPostal;
        this.numPorta = numPorta;
        this.andar = andar;
    }
    
}
