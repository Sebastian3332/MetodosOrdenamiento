import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] arreglo = {12,  -7,  25,  0,   -15,   33,   19,   -22,   4,   48,   -3};

        int opcion;

        do {
          System.out.println("-------- PROGRAMA DE ORDENAMIENTO --------");
          System.out.println("1. Ejecutar ordenamientos");
          System.out.println("2. Salir");
          System.out.print("Ingrese una opcion: ");
          opcion = sc.nextInt();
          if (opcion < 1 ||  opcion > 2) {
            System.out.println("ERROR: Opcion no valida");
          }

          if (opcion == 1) {
            System.out.println("¿Metodo insercion de orden ascendente? (true/false)");
            boolean insercionAsc = sc.nextBoolean();
            System.out.println("¿Metodo shell de orden ascendente? (true/false)");
            boolean shellAsc = sc.nextBoolean();

            Insercion insObj = new Insercion();
            insObj.sort(arreglo, insercionAsc);

            Shell shellObj = new Shell();
            shellObj.sort(arreglo, shellAsc);
          }


        }while (opcion != 2);

        System.out.println("FIN DEL PROGRAMA....");

    }
}
