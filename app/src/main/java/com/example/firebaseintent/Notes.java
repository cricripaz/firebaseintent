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
        int res1 = Character.getNumericValue(primero.toCharArray()[0])*10 + Character.getNumericValue(primero.toCharArray()[1]);
        int res2 = Character.getNumericValue(segundo.toCharArray()[0])*10 + Character.getNumericValue(segundo.toCharArray()[1]);
        int res3 = Character.getNumericValue(tercero.toCharArray()[0])*10 + Character.getNumericValue(tercero.toCharArray()[1]);
        if(primero.equals("100")) {
            res1 = 100;
        }
        if (segundo.equals("100")) {
            res2 = 100;
        }
        if (tercero.equals("100")) {
            res3 = 100;
        }
        int resFin = (int) (res1*0.3 + res2*0.3 + res3*0.4);
        String resFinStr = Integer.toString(resFin);
        return resFinStr;
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
