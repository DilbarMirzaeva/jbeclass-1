package abstraction.animalPark;

public class Cat extends Mammal{
    @Override
    void makeSound() {
        System.out.println("meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleep");
    }

    @Override
    public void roar() {
        System.out.println("Cat roar");
    }

}
