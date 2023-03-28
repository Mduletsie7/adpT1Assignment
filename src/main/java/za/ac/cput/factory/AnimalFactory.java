/**
 * AnimalFactory.java
 * This is the AnimalFactory
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

package za.ac.cput.factory;

import za.ac.cput.domain.Animal;
import za.ac.cput.util.Helper;

//AnimalFactory class starts here
public class AnimalFactory {
    public static Animal createAnimal(String colour, String species, String sound) {
        if (Helper.isNullOrEmpty(colour) || Helper.isNullOrEmpty(species) || Helper.isNullOrEmpty(sound)) {
            return null;
        }

        Animal animal = new Animal.Builder()
                .setColour(colour)
                .setSpecies(species)
                .setSound(sound)
                .build();

        return animal;
    }
}
