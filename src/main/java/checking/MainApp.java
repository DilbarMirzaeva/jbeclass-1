package checking;

public class MainApp {
    public static void main(String[] args) {
        Animal animal1;
        Cat animal = new Cat();
        animal1 = new Cat();

        System.out.println(animal1.sound());

        Dog dog = new Dog();
        animal1 = new Dog();

        System.out.println(animal.sound());
        System.out.println(dog.sound());
        System.out.println(animal1.sound());

        System.out.println((dog.sound()).equals(animal1.sound()));

        if (dog.sound() == animal1.sound()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


}
