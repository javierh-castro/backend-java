public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        System.out.println("Desafio de temperatura");
        int temperatura = 23;
        var calculo = (temperatura * 1.8) + 32;
        System.out.println("tempaeratura: " + calculo);

//       como lo iso la clase
        double temperaturaEnCelsius = 23;

        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit; //Esto es para redondear un numero
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }
}