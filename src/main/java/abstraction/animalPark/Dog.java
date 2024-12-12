package abstraction.animalPark;

public class Dog extends Mammal{


    @Override
    void makeSound() {
        System.out.println("havhav");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void roar() {
        System.out.println("Dog roar");
    }

}
