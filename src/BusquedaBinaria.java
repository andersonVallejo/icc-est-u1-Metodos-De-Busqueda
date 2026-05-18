

import models.Person;

public class BusquedaBinaria {
    public void sortByName(Person[] personita) {
        for (int i = 0; i < personita.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < personita.length - i - 1; j++) {
                if (personita[j].getName().compareTo(personita[j + 1].getName()) > 0) {
                    Person aux = personita[j];
                    personita[j] = personita[j + 1];
                    personita[j + 1] = aux ;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    public int findByname(Person[]people, String name) {
         int bajo = 0;
         int alto = people.length - 1;

         
        while (bajo <= alto ){
        int medio = (bajo + alto) / 2;
        if (people[medio].getName().equals(name)) {
            return medio;
        } 
        if (people[medio].getName().compareTo(name) < 0) {
            bajo = medio + 1;
        } else {
            alto = medio - 1;
        }
        
    }
        return -1 ; 
    
}
}
