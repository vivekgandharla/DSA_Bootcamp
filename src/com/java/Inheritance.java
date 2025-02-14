package com.java;
//single inheritance
class Animal {
    void eat(){
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Dog is barking.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }


    //Multilevel inheritance

    class Puppy extends Animal {
        void weep(){
            System.out.println("Puppy is weeping.");
        }
    }
    static class multilevel{
        public static void main(String[] args) {
            Puppy puppy = new Puppy();
            puppy.eat();
            puppy.weep();
            puppy.bark()
        }
    }
    //Hierarchical inheritance
    class Parent4 {

    }
    class Child1 extends Parent4 { }
    class Child2 extends Parent4 { }
}
