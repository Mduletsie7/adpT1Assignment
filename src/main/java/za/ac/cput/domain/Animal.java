/**
 * Animal.java
 * This is the Animal POJO
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

package za.ac.cput.domain;

import java.util.Objects;

public class Animal {
    private String colour;
    private String species;
    private String sound;

    public Animal() {}

    public Animal(Builder builder) {
        this.colour = builder.colour;
        this.species = builder.species;
        this.sound = builder.sound;
    }

    //Getters
    public String getColour() {
        return colour;
    }

    public String getSpecies() {
        return species;
    }

    public String getSound() {
        return sound;
    }


    public static class Builder {
        private String colour;
        private String species;
        private String sound;

        //Setter
        public Builder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public Builder setSound(String sound) {
            this.sound = sound;
            return this;
        }


        public Builder copy(Animal animal) {
            this.colour = animal.colour;
            this.species = animal.species;
            this.sound = animal.sound;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(colour, animal.colour) && Objects.equals(species, animal.species) && Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colour, species, sound);
    }

    @Override
    public String toString() {
        return "Builder{" +
                "colour='" + colour + '\'' +
                ", species='" + species + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
