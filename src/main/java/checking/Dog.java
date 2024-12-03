package checking;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String sound() {
        return new String("hawhaw");
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbreed:"+getBreed();
    }
}
