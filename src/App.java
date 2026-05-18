import models.Person;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea ingresar?: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Person[] people = new Person[n];

        // Ingresar datos
        for (int i = 0; i < n; i++) {
            System.out.println("\nPersona " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            people[i] = new Person(nombre, edad);
        }

        // Ordenar
        BusquedaBinaria busqueda = new BusquedaBinaria();
        busqueda.sortByName(people);

        System.out.println("\nPersonas ordenadas:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Buscar
        System.out.print("\nIngrese el nombre a buscar: ");
        String nameToFind = sc.nextLine();

        int index = busqueda.findByName(people, nameToFind);

        if (index != -1) {
            System.out.println("Encontrado: " + people[index]);
        } else {
            System.out.println(nameToFind + " no encontrado.");
        }

        sc.close();
    }
}

    
