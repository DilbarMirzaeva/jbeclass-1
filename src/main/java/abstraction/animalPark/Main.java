package abstraction.animalPark;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dog:");
        Dog dog=new Dog();
        dog.setName("Bobby");
        dog.getName();
        dog.setAge(3);
        dog.getAge();
        dog.info();
        dog.eat();
        dog.makeSound();
        dog.sleep();
        dog.roar();

        System.out.println("\nCat:");
        Cat cat =new Cat();
        cat.setName("Miki");
        cat.getName();
        cat.setAge(2);
        cat.getAge();
        cat.info();
        cat.makeSound();
        cat.eat();
        cat.sleep();
        cat.roar();

        System.out.println("\nLion:");
        Lion lion=new Lion();
        lion.setName("Simba");
        lion.getName();
        lion.setAge(4);
        lion.getAge();
        lion.makeSound();
        lion.hunt();
        lion.roar();
        lion.eat();
        lion.sleep();

        System.out.println("\nPolymorphism checking");
        Animal animal=lion;
        animal.eat();
        animal.sleep();

        Wild wild=lion;
        wild.habitat();
        wild.hunt();
        wild.roar();

    }
}
