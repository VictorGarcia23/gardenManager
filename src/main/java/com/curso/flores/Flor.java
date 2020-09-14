package com.curso.flores;



public class Flor {

    private int nroPetalos;
    private String queSueltan;
    private String tipoDeFlor;

    public Flor(int nroPetalos, String tipoDeFlor){
        this.nroPetalos= nroPetalos;
        this.tipoDeFlor= tipoDeFlor;
    }
    public int getNroPetalos(){ return nroPetalos;}
    public String getTipoDeFlor(){ return tipoDeFlor;}


    public String regar() {
        StringBuilder sb= new StringBuilder();
        sb.append("Soy una ");
        sb.append(getTipoDeFlor());
        sb.append(" y me estan regando");
        return sb.toString();
    }

    public String florecer(){
        StringBuilder sb= new StringBuilder();
        sb.append("Soy una ");
        sb.append(getTipoDeFlor());
        sb.append(" y me ven porque estoy floreciendo");
        return sb.toString();
    }

}
