//Write Java programs for the following:
//Write a program to print whether a number is even or odd, also take input from the user.
//Take name as input and print a greeting message for that particular name.
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.
//To find out whether the given String is Palindrome or not.
//To find Armstrong Number between two given number.
package com.java;

import java.util.Scanner;

public class Assignment2 {
    static class evenOdd{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int Number = input.nextInt();
            if(Number%2==0){
                System.out.println("Number is even");
            }else System.out.println(
                    "Number is Odd"
            );
        }

    }
    static class greetingMsg{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hi!, what's your name? ");
            String name = sc.nextLine();
            System.out.println("Hello! Happy new year "+name);
        }
    }
    static class simpleInterest{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter principal, rate and time ");
            double principal = sc.nextDouble();
            double rate = sc.nextDouble();
            double time = sc.nextDouble();
            double SI = (principal*rate*time)/100;
            System.out.println("The Simple Interest is : "+ SI);
        }
    }
}
