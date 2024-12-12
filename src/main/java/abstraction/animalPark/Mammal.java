package abstraction.animalPark;

public abstract class Mammal implements Wild,Animal {

    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        System.out.print("Name:");
        return name;
    }

    public int getAge() {
        System.out.print("Age:");
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(){
        System.out.println("Mammals move");
    }

    @Override
    public void hunt() {
        System.out.println("This animal hunt");
    }

    abstract void makeSound();

    }


