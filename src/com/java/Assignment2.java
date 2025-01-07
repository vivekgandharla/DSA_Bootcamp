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
    static class operator{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input 2 numbers: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            System.out.println("Enter an operator(+,-,*,/): ");
            char operator = sc.next().charAt(0);
            double result;

            if(operator == '+'){
                result = a+b;
                System.out.println("Addition:"+ result);
            }

            else if(operator == '-'){
                result = a-b;
                System.out.println("Subtraction:"+ result);
            }
            else if(operator == '*'){
                result = a+b;
                System.out.println("Multiplication  :"+ result);
            }
            else if(operator == '/'){
                result = a+b;
                System.out.println("Division:"+ result);
            }else {
                System.out.println("Invalid operator..");
            }
            sc.close();
        }
    }
    static class largestNumber{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(num1>num2){
                System.out.println("num1 is largest: "+num1);
            }else System.out.println("num2 is largest: "+num2);
        }
    }
    static class currency{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount: ");
            int amount = sc.nextInt();
            double conversion = 85.76;
            double dollar = amount/conversion;
            System.out.printf("The amount in USD is: %.2f\n", dollar);
        }
    }
    static class Fibonacci{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of terms in the Fibb series: ");
            int input = sc.nextInt();
            int firstTerm = 0, secondTerm = 1;
            for (int i = 1; i <= input ; i++) {
                System.out.print(firstTerm + ",");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;

            }
        }
    }
    static class palindrome{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word: ");
            String str = sc.nextLine();
            int start = 0;
            int end = str.length() -1;
            boolean isPalindrome = true;

            while (start<end){
                if(str.charAt(start) != str.charAt(end)){
                    isPalindrome = false;
                }
                start++;
                end--;
            }
            if(isPalindrome){
                System.out.println("Palindrome");
            }else System.out.println("Not a palindrome");

        }
    }

    static class Palindrome1{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values to check palindrome: ");
            String str = sc.nextLine();
            int start = 0;
            int end = str.length() -1;
            boolean isPalindrome = true;
            while (start<end){
                if(str.charAt(start)!=str.charAt(end)){
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }
            if(isPalindrome){
                System.out.println("Palindrome");
            } else System.out.println("Not a palindrome ");
        }
        static class armStrong{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the starting number: ");
                int start = sc.nextInt();
                System.out.println("Enter the ending number : ");
                int end = sc.nextInt();

                System.out.println("Armstrong numbers between"+start+"And "+ end+ ": ");

                for (int i = start; i <= end; i++) {
                    if(isArmstrong((i))){
                        System.out.println(i);
                    }
                }
                sc.close();

            }
        }
    }public static boolean isArmstrong(int number){
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number>0) {
            int digit = number%10;
            sum+=Math.pow(digit,digits);
            number /= 10;
        }
        return sum == originalNumber;
    }

}
