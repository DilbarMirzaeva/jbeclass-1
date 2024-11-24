package oop;

public class People {

    public static int age;
    public static int weight;

    public String name;
    public String surname;

    private String constructorType;

    public People(String name,int age){
        this.name=name;
        People.age=age;
        constructorType="constructor1";
    }

    public People(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        People.age=age;
        constructorType="constructor2";

    }

    public  String toString(){

        if("constructor1".equals(constructorType)){
            return "name:"+name +"\nage:" +age;
        } else if ("constructor2".equals(constructorType)) {
            return "name:"+name +"\nsurname:"+surname+"\nage:" +age;
        }else{
            return "nothing";
        }
    }
}
