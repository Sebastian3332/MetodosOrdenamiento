public class Insercion {
    public int [] sort(int [] originalArray, boolean asc) {
        int[] arreglo = originalArray.clone();
        int cambios = 0;
        int comparaciones = 0;
        int iteraciones = 0;

        System.out.println("------------------- METODO INSERCION --------------------");
        imprimirArreglo("\nArreglo: ", arreglo);

        for (int i = 1; i < arreglo.length; i++) {
            iteraciones++;
            int valorActual = arreglo[i];
            int j = i - 1;

            System.out.print("\n\nI" + iteraciones + "  ");

            boolean huboCambio =  false;

            while (j >= 0) {
                comparaciones++;
                boolean condicion = asc ? (arreglo[j] > valorActual) : (arreglo[j] < valorActual);
                System.out.print("     a=" + (j + 1) + "     b=" + j + "     [" + (j+1) + "]=" + arreglo[j+1] + "     [" + j + "]=" + arreglo[j]);

                if (condicion) {
                    arreglo[j + 1] = arreglo[j];
                    cambios++;
                    System.out.println("     cambio=si\n");
                    j--;
                    huboCambio = true;
                } else {
                    System.out.println("     cambio=no\n");
                    break;
                }
            }
            arreglo[j + 1] = valorActual;
            imprimirArreglo("Arreglo: ", arreglo);
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("Cambios: " + cambios);
        
        return new int[]{comparaciones, cambios, iteraciones};
    }

    private void imprimirArreglo(String msg, int[] arreglo) {
        System.out.print(msg + " ");
        for (int n : arreglo) System.out.print(n + "  ");
        System.out.println();
    }
    
}
