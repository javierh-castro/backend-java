public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a Screen Match");
        System.out.println("com.aluracursos.screenmatch.modelos.Pelicula: Matrix");

        int fechaDeLanzamiento = 2001;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja 
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println("primero" + media/2 +  " nose que es: " + clasificacion);
    }
}