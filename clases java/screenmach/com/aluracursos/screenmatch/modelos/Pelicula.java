package com.aluracursos.screenmatch.modelos;

import screenmatch.claculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public int getClasificacion() {
        System.out.println("Aca en pelicula " + (int) (calculaMedia() / 2));
        return (int) (calculaMedia() / 2);
    }
}
