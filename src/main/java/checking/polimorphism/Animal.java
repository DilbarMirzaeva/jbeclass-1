package checking.polimorphism;

import java.util.Objects;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String sound() {
        return "animal sound";
    }

    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass()!= obj.getClass()) return false;

        Animal animal=(Animal) obj;
        return name.equals(animal.name) &&
                age==animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString(){
        return "name:"+getName() +
                "\n age:"+getAge();
    }
}
