package com.java;
class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age >= 18) {
            return age;
        } else System.out.println("UnderAge");
        return 0;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
}
public class dataHiding {
        public static void main(String[] args) {
            Person p = new Person();

            p.setName("Karan");  // Using setter
            p.setAge(18);

            System.out.println("Name: " + p.getName());  // Using getter
            System.out.println("Age: " + p.getAge());
        }
    }

