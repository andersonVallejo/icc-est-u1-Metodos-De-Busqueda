package models;

public class Ordenamieto {
    

    public static void ordenarPorEdad(int[] edades) {
        int n = edades.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (edades[j] > edades[j + 1]) {
                    int aux = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = aux;
                }
            }
        }
    }

    public static void mostrarArreglo(int[] edades) {
        System.out.print("Arreglo: ");
        for (int edad : edades) {
            System.out.print(edad + " ");
        }
        System.out.println();
    }
}

