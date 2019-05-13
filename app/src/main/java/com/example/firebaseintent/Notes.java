package com.example.firebaseintent;

public class Notes {
    private int primero;
    private int segundo;
    private int tercero;
    private int resultado;
    private String  n_materia;


    public Notes(int primero, int segundo, int tercero, int resultado, String n_materia) {
        this.primero = primero;
        this.segundo = segundo;
        this.tercero = tercero;
        this.resultado = resultado;
        this.n_materia = n_materia;
    }

    public Notes (){
    }


    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getTercero() {
        return tercero;
    }

    public void setTercero(int tercero) {
        this.tercero = tercero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public String getN_materia() {
        return n_materia;
    }

    public void setN_materia(String n_materia) {
        this.n_materia = n_materia;
    }
}
