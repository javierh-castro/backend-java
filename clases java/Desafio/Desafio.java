import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//        String menu = "Escriba eI número de la opción deseada\n" +
//                "1 - Consultar saldo\n" +
//                "2 - Retirar\n" +
//                "3 - Depositar\n" +
//                "9 - salir";
        String menu = """
                Escriba eI número de la opción deseada
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - salir""";
        System.out.println(menu);
        int saldo = 1200;
        int contador = 1;
//        boolean valor = true;
        int valor = 0;
        while (valor != 9) {
            valor = Integer.parseInt(teclado.nextLine());
            System.out.println(valor);

            if (valor == 1) {
                System.out.println("Tu saldo es: " + saldo);
            } else if (valor == 2) {
                System.out.println("Cuanto vas a retirar");
                int retiro = Integer.parseInt(teclado.nextLine());
                saldo = saldo - retiro;
                System.out.println("Retiraste: " + retiro);
            } else if (valor == 3) {
                System.out.println("Cuanto vas a depositar: ");
                int deposito = Integer.parseInt(teclado.nextLine());
                saldo = saldo + deposito;
                System.out.println("Despositaste: " + deposito);
            } else {
                System.out.println("No existe");
            }
            System.out.println("Este es tu saldo actual: " + saldo);
            System.out.println(menu);
        }
        System.out.println("Termino el progama!!!");
    }
}
