package checking;

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

    public String sound() {
        return "meoww";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ntailLength:"+getTailLength();
    }
}
