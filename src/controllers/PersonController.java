package controllers;

import models.Person;

public class PersonController {

    public void sortByName(Person[] people) {
        boolean swapped;
        for (int i = 0; i < people.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < people.length - i - 1; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    //Intercambio Correspondiente
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                //Sale del bucle
                break;
            }
        }
    }
}
