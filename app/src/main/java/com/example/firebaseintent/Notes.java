package com.example.firebaseintent;

public class Notes {
    private String primero;
    private String segundo;
    private String tercero;
    private String resultado;
    private String  n_materia;


    public Notes(String primero, String segundo, String tercero, String resultado, String n_materia) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.resultado = resultado;
        this.n_materia = n_materia;
    }

    public Notes (){
    }


    public String getPrimero() {
        return primero;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }

    public String getTercero() {
        return tercero;
    }

    public void setTercero(String tercero) {
        this.tercero = tercero;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getN_materia() {
        return n_materia;
    }

    public void setN_materia(String n_materia) {
        this.n_materia = n_materia;
    }
}
