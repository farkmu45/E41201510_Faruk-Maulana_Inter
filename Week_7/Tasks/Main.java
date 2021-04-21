package Week_7.Tasks;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise();
        Dog dog = new Dog();
        dog.makeNoise();

        Animal animalDog = new Dog();
        animalDog.makeNoise();

        if (animal instanceof Animal) {
            System.out.println("Animal is Animal");
        }

        if (dog instanceof Animal) {
            System.out.println("dog is Animal");
        }

        if (animalDog instanceof Animal) {
            System.out.println("animaldog is Animal");
        }

        if (animal instanceof Dog) {
            System.out.println("animal is Dog");
        }
    }
}
