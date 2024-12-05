package checking.polimorphism;

public class Cat extends Animal {

    private int tailLength;

    public Cat(String name, int age, int tailLength) {
        super(name, age);
        this.tailLength = tailLength;

    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass()) return false;

        Cat cat=(Cat) obj;
        return tailLength==cat.tailLength && super.equals(obj);
    }

    public int hashCode(){
        return 31*tailLength;
    }

    public String sound() {
        return "meoww";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntailLength:"+getTailLength();
    }
}
