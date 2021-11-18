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

    public Morada() {
    }
    
    public Morada(String rua, DistritoEnum distrito, String freguesia, String concelho, String codigoPostal, String numPorta, String andar) {
        this.rua = rua;
        this.distrito = distrito;
        this.freguesia = freguesia;
        this.concelho = concelho;
        this.codigoPostal = codigoPostal;
        this.numPorta = numPorta;
        this.andar = andar;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public DistritoEnum getDistrito() {
        return distrito;
    }

    public void setDistrito(DistritoEnum distrito) {
        this.distrito = distrito;
    }

    public String getFreguesia() {
        return freguesia;
    }

    public void setFreguesia(String freguesia) {
        this.freguesia = freguesia;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNumPorta() {
        return numPorta;
    }

    public void setNumPorta(String numPorta) {
        this.numPorta = numPorta;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }
    
    
}
