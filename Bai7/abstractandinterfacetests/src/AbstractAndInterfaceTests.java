package Bai7.abstractandinterfacetests.src;

import Bai7.abstractandinterfacetests.src.animal.Animal;
import Bai7.abstractandinterfacetests.src.animal.Chicken;
import Bai7.abstractandinterfacetests.src.animal.Tiger;
import Bai7.abstractandinterfacetests.src.edible.Edible;
import Bai7.abstractandinterfacetests.src.fruit.Fruit;
import Bai7.abstractandinterfacetests.src.fruit.Orange;
import Bai7.abstractandinterfacetests.src.fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}