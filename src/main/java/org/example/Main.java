package org.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println( animal instanceof Object);
        System.out.println( animal instanceof Animal);
        System.out.println(  animal instanceof Bat);
        Animal cat = new Cat(); //업캐스팅이 된 상태
        System.out.println( cat instanceof Object);
        System.out.println( cat instanceof Cat);
        System.out.println( cat instanceof Animal);
        System.out.println( cat instanceof Bat);
    }
}