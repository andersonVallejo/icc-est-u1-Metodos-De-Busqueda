import models.Person;

public class BusquedaBinaria {

    // ORDENAR POR EDAD
    public void ordenarPorEdad(Person[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getAge() > personas[j + 1].getAge()) {
                    Person aux = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = aux;
                }
            }
        }
    }

    // BUSQUEDA BINARIA CON IMPRESIÓN
    public int buscarPorEdad(Person[] personas, int edadBuscar) {
        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {

            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getAge();

            // MOSTRAR PROCESO
            System.out.println("bajo=" + bajo + " alto=" + alto +
                    " centro=" + centro + " valorCentro=" + valorCentro);

            if (valorCentro == edadBuscar) {
                System.out.println("--> ENCONTRADO");
                return centro;
            }

            if (edadBuscar > valorCentro) {
                System.out.println("--> DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("--> IZQUIERDA");
                alto = centro - 1;
            }
        }

        return -1;
    }
}
