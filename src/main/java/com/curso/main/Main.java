package com.curso.main;

import com.curso.flores.Gardenia;
import com.curso.flores.Geranio;
import com.curso.flores.Violeta;
import com.curso.jardines.Jardin;

public class Main {

    public static void main(String[] args) {

        //CREAR JARDIN
        Jardin jardinDeAddy= new Jardin();

        //CREAR FLORES
        Gardenia gardenia1= new Gardenia(6, "Gardenia");
        Gardenia gardenia2= new Gardenia(4, "Gardenia");
        Gardenia gardenia3= new Gardenia(4, "Gardenia");

        Violeta violeta1= new Violeta(6,  "Violeta");
        Violeta violeta2= new Violeta(6,  "Violeta");
        Violeta violeta3= new Violeta(6,  "Violeta");

        Geranio geranio1= new Geranio(5, "Geranio");
        Geranio geranio2= new Geranio(5, "Geranio");
        Geranio geranio3= new Geranio(3, "Geranio");

        //CREAR LISTA FLORES EN JARDIN
        jardinDeAddy.addFlor(gardenia1);
        jardinDeAddy.addFlor(gardenia2);
        jardinDeAddy.addFlor(gardenia3);
        jardinDeAddy.addFlor(violeta1);
        jardinDeAddy.addFlor(violeta2);
        jardinDeAddy.addFlor(violeta3);
        jardinDeAddy.addFlor(geranio1);
        jardinDeAddy.addFlor(geranio2);
        jardinDeAddy.addFlor(geranio3);

        //REGAR FLORES
        jardinDeAddy.regarFlores();
        System.out.println(" ");

        jardinDeAddy.verFlorecer();
        System.out.println(" ");

        jardinDeAddy.verLoQueSueltanGardenias();
        System.out.println(" ");

        jardinDeAddy.verLoQueSueltanVioletas();
        System.out.println(" ");



    }
}
