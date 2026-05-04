public class Shell {
    public int[] sort(int[] originalArray, boolean asc) {
        int[] arreglo = originalArray.clone();
        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("-------------------- METODO SHELL ----------------------");
        imprimirArreglo("\nArreglo:", arreglo);

        for (int gap = arreglo.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arreglo.length; i++) {
                iteraciones++;
                int aux = arreglo[i];
                int j = i;

                System.out.print("\n\nI" + iteraciones + "    gap=" + gap + " ");

                while (j >= gap) {
                    comparaciones++;
                    boolean condicion = asc ? (arreglo[j - gap] > aux) : (arreglo[j - gap] < aux);
                    
                    System.out.print("     a=" + (j - gap) + "     b=" + j + "     [" + (j-gap) + "]=" + arreglo[j-gap] + "     [" + j + "]=" + aux);
                    
                    if (condicion) {
                        arreglo[j] = arreglo[j - gap];
                        cambios++;
                        System.out.println("     cambio=si\n");
                        j -= gap;
                    } else {
                        System.out.println("     cambio=no\n");
                        break;
                    }
                }
                arreglo[j] = aux;
                imprimirArreglo("Estado:", arreglo);
            }
        }

        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);

        return new int[]{comparaciones, cambios, iteraciones};
    }

    private void imprimirArreglo(String msg, int[] arreglo) {
        System.out.print(msg + " ");
        for (int n : arreglo) System.out.print(n + "  ");
        System.out.println();
    }
}