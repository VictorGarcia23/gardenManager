package com.curso.jardines;

import com.curso.flores.Flor;
import com.curso.flores.Gardenia;
import com.curso.flores.Violeta;

import java.util.ArrayList;
import java.util.List;

public class Jardin {

    List<Flor> flores= new ArrayList<Flor>();
    public List<Flor> getFlores(){ return flores; }


    public void addFlor(Flor flor){

        if(flores!=null){
            flores.add(flor);
        }
    }

    public void removeFlor(Flor florQueBorrare){

        flores.remove(florQueBorrare);
    }

    public void regarFlores() {
        for (Flor flor: flores) {
            System.out.println(flor.regar());
        }
    }

    public void verFlorecer(){
        for (Flor flor: flores) {
            System.out.println(flor.florecer());
        }
    }

    public void verLoQueSueltanGardenias(){
        for (Flor flor:flores) {
            if(flor instanceof Gardenia){
                System.out.println(((Gardenia) flor).soltarPolen()); //Casting
            }
        }
    }

    public void verLoQueSueltanVioletas(){
        for (Flor flor: flores) {
            if(flor instanceof Violeta){
                System.out.println(((Violeta) flor).soltarAbeja());//Casting
            }
        }
    }
}
