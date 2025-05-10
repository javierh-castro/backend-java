package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    public String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public int getTotalDeLasEvaluaciones() {
        return totalDeLasEvaluaciones;
    }
    public void muestraFichaTecnica() {
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es:" + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + duracionEnMinutos);
    }

    public void evalua(double nota){//Espera un dato de tipo double
     sumaDeLasEvaluaciones += nota;
//     totalDeLasEvaluaciones += 1;
     totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
