import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import screenmatch.claculos.CalculadoraDeTiempo;
import screenmatch.claculos.FiltrosRecomendacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
//        miPelicula.nombre = "Encanto";
//        miPelicula.fechaDeLanzamiento = 2021;
//        miPelicula.duracionEnMinutos = 120;
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(6);//EStoy llamando la funcion
        miPelicula.evalua(7);
//        System.out.println(miPelicula.totalDeLasEvaluaciones);//Ya no podemos llamar eso porque es privado
        System.out.println("esto es: " + miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());


        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println("Aca es:");
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
         calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesanio para ver tus títulos favoritos estas vacaciones  "
                + calculadora.getTiempoTotal());

        FiltrosRecomendacion filtrosRecomendacion = new FiltrosRecomendacion();
        filtrosRecomendacion.filtra(miPelicula);



        Episodio episodio = new Episodio();
        episodio. setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtrosRecomendacion.filtra(episodio);
    }
}
