import models.Person;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scaneo = new Scanner(System.in);

        System.out.print("Ingrese cantidad de personas: ");
        int n = scaneo.nextInt();
        scaneo.nextLine();

        Person[] personas = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nIngrese Persona:");

            System.out.print("Nombre: ");
            String nombre = scaneo.nextLine();

            System.out.print("Edad: ");
            int edad = scaneo.nextInt();
            scaneo  .nextLine();

            personas[i] = new Person(nombre, edad);
        }

        BusquedaBinaria bb = new BusquedaBinaria();

        // ORDENAR
        bb.ordenarPorEdad(personas);

        System.out.println("\nArreglo ordenado:");
        for (Person p : personas) {
            System.out.print(p.getAge() + " | ");
        }
        System.out.println();

        // BUSCAR
        System.out.print("\nValor a buscar: ");
        int edadBuscar = scaneo.nextInt();

        int pos = bb.buscarPorEdad(personas, edadBuscar);

        if (pos != -1) {
            System.out.println("\nLa persona con la edad " + edadBuscar +
                    " es " + personas[pos].getName());
        } else {
            System.out.println("Edad no encontrada.");
        }
    }
}

    
