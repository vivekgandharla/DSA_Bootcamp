package com.java;

import java.util.Scanner;

//        Input a year and find whether it is a leap year or not.
//        Take two numbers and print the sum of both.
//        Take a number as input and print the multiplication table for it.
//        Take 2 numbers as inputs and find their HCF and LCM.
//        Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("Is a leap year");
        }else System.out.println("Not a leap year");
    }
}
class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum of a & b : "+ c);
    }
}
class que2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }
        sc.close();
    }
}
class que3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num1 = sc.nextInt();
        int num2 =  sc.nextInt();
        int hcf = calculateHCF(num1,num2);
        //LCM
        int lcm = (num1*num2)/hcf;
        System.out.println("HCF of "+num1+"and"+num2+"is: "+hcf);
        System.out.println("LCM of "+num1+"and"+num2+"is: "+lcm);
    }
    public static int calculateHCF(int a, int b){
        while (b!=0){
            int temp = b;//9 , 18
            b = a%b;
            a = temp;
        }
        return a;
    }
}
class que4{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i = num.nextInt();
        char x = 'x';
        int sum = i+i;
        for(i = 1;i<x;i++){
            System.out.println(sum);
            sum = sum + i;
        }
    }
}