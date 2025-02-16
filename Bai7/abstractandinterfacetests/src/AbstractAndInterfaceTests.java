public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }

    public static abstract class Animal {
        public abstract String makeSound();
    }

    public static class Tiger extends Animal {
        @Override
        public String makeSound() {
            return "Tiger: roarrrrr!";
        }
    }

    public static class Chicken extends Animal {
        @Override
        public String makeSound() {
            return "Chicken: cluck-cluck!";
        }
    }
}
