package checking.polimorphism;

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
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass() != obj.getClass()) return false;

        Dog dog=(Dog) obj;
        return (breed==null? dog.breed==null :breed.equals(dog.breed)) && super.equals(obj);
    }

    public int hashCode(){
        return 31*breed.hashCode();
    }

    @Override
    public String sound() {
        return "hawhaw";
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbreed:"+getBreed();
    }
}
