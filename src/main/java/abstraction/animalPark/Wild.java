package abstraction.animalPark;

public interface Wild {
    void hunt();
    void roar();
    default void habitat(){
        System.out.println("This one lives in the wild");
    }
}
