package org.example.lesson1;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bobik");
        Cat cat1 = new Cat("Murzik");

        System.out.println(dog1.run(400));
        System.out.println(Animal.getInstanceCounter());
    }
}