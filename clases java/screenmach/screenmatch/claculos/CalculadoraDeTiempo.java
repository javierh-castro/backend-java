package screenmatch.claculos;
import com.aluracursos.screenmatch.modelos.Pelicula;//No llamamos con el from ni tambien export
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public  void incluye(Titulo titulo){
          this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

//    public  void incluye(Pelicula pelicula){
//        tiempoTotal += pelicula.getDuracionEnMinutos();
//    }
//    public void incluye(Serie serie){
//        tiempoTotal += serie.getDuracionEnMinutos();
//    }
}
