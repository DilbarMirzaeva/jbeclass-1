package abstraction.animalPark;

public class Lion extends Mammal{

    @Override
    void makeSound() {
        System.out.println("wraaaoow");
    }

    @Override
    public void hunt() {
        System.out.println("Lion hunt");
    }

    @Override
    public void roar() {
        System.out.println("Lion roar");
    }

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleep");
    }
}
