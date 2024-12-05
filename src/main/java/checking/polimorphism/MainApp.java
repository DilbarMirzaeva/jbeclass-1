package checking.polimorphism;

public class MainApp {
    public static void main(String[] args) {

        Animal animal=new Cat("Miki",1,26);
        Animal animal1=new Dog("Beth",3,"Golden Retriever");

        Animal animal2=new Animal("mikee",4);
        Animal animal3=new Animal("mikee",4);

        System.out.println(animal.toString());
        System.out.println(animal1.toString());
        System.out.println(animal.sound());
//        System.out.println(animal1.getBreed);//xeta
        System.out.println(((Dog)animal1).getBreed());

        System.out.println(animal2.equals(animal3));
        System.out.println(animal2.hashCode() +" " +animal3.hashCode());

        Cat cat =new Cat("mestan",2,21);
        Dog dog=new Dog("qwerty",3,"retriver");
        Dog dog1=new Dog("qwery",3,"retriver");
        System.out.println(dog.equals(dog1));
        System.out.println(dog.sound().equals(cat.sound()));

    }
}
