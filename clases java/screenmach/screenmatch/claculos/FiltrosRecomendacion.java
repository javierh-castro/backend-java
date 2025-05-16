package screenmatch.claculos;

public class FiltrosRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy bien evaluado en el momento");
        }else if (clasificacion.getClasificacion() >= 3){
            System.out.println("popular en el mometo");
        }else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
