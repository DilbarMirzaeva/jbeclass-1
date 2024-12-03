package checking;

public class MainApp {
    public static void main(String[] args) {

        Animal animal=new Cat("Miki",1,26);
        Animal animal1=new Dog("Beth",3,"Golden Retriever");

        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        System.out.println(animal.sound());
//        System.out.println(animal1.breed);//xeta
        System.out.println(((Dog)animal1).getBreed());

    }
}
