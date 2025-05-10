import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(6);//EStoy llamando la funcion
        miPelicula.evalua(7);
//        System.out.println(miPelicula.totalDeLasEvaluaciones);//Ya no podemos llamar eso porque es privado
        System.out.println("esto es: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());







//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 2004;
//        otraPelicula.duracionEnMinutos = 180;
//
//        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
