package abstraction.animalPark;

public interface Animal {
    void eat();
        void sleep();
        default void info(){
            System.out.println("This is an animal");
        }
}
