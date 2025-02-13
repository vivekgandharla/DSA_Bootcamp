package com.java;

public class Student1
{
    private int id, age;
    private String name,city;
    private int score;
    static int batchCode;
    static String batchName;
    public void getDetails(int id, int age, String name, String city, int score)
    {
        this.id = id;
        this.age= age;
        this.name = name;
        this.city=city;
        this.score = score;
    }
    public void grade()
    {
        double cal =0.0;
        cal = (this.score/10);
        System.out.println(cal);
        if(cal>=9.0)
            System.out.println("A grade");
        else if(cal>=8.0 && cal<9.0 )
            System.out.println("B grade");
        else if(cal>=7.0 && cal<8.0)
            System.out.println("C grade");
        else if(cal>=4.0 && cal<7.0)
            System.out.println("Pass");

        else  System.out.println("Fail");


    }
    void details()
    {
        System.out.println("Id :  "+ this.id+" Name : "+this.name+ " Grade : ");
        grade(); // calling grade()

    }
    public static void batchDetails()
    {
        batchCode = 111101;
        batchName = "Java Batch";
        System.out.println("Batch Code : "+ batchCode);
        System.out.println("Batch Name : "+batchName);


    }
    public static void main(String args[])
    {

        Student1.batchDetails(); // static method calling
        Student1 s1 = new Student1(); // creating Object
        s1.getDetails(111,21,"Ram","Banguluru",89);
        Student1 s2 = new Student1();
        s2.getDetails(222,22,"Ravi","Pune",79);
        s1.details(); //calling non static method through object
        s2.details();
    }
}