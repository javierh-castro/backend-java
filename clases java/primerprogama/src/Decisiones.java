public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 2022;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";


        if (fechaDeLanzamiento > 2022) {
            System.out.println("Pelicualas mas populares");
        }else  {
            System.out.println("Pelicula vieja");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")) {
            System.out.println("Este plan es plus");
        } else {
            System.out.println("Pelicula no disponible para su pla actual");
        }
    }
}