/**
 * AnimalFactoryTest.java
 * This is the AnimalFactoryTest
 * @author Lerato Moshabi - 220076073
 * 11 March 2023
 */

package za.ac.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Animal;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

//AnimalFactoryTest class starts here
class AnimalFactoryTest {
    // i. Object Equality Test
    @Test
    public void testCompareAnimalSpecies() {
        Animal animalSpecies = new Animal();
        Animal mySpecies = AnimalFactory.createAnimal("Black", "Cat", "Mhew");
        String speciesName = mySpecies.getSpecies().toString();
        assertEquals(speciesName, "Janguar");
    }


    // ii. Object Identity Test
    @Test
    public void testObjectIdentity() {
        Animal animal = new Animal();
        Animal animal1 = AnimalFactory.createAnimal("Blue", "Whale", "dfghtrg");
        Animal animal2 =  animal1;
        Animal animal3 = AnimalFactory.createAnimal("White", "Shark", "rete");

        assertSame(animal1, animal3);
    }

    // iii. Animal build Failing TEST
    @Test
    public void test_fail(){
        Animal animal = AnimalFactory.createAnimal("", "Dog","Woof");
        assertNotNull(animal);
        System.out.println(animal.toString());

    }

    // iv. Timeout Test
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Execution exceeded timout duration!");
        });
    }

    // v. Disabling Test
    @Disabled("TODO: Still need to code this method")
    @Test
    public void test_productInTransit() {
    }
}
