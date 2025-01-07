package com.java;

import java.util.Scanner;
import java.util.SortedMap;

public class Problems1 {
    //Area Of Circle Java Program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.println("Area of circle is : "+area);
    }
    static class AreaOfTriangle{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base & height ");
            double base = sc.nextDouble();
            double height = sc.nextDouble();
            double area = 0.5*base*height;
            System.out.println("Area of triangle is: "+area);
        }
    }
    static class AreaOfRectangle{
        public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter the length of the rectangle: ");
            double length = sc.nextDouble();
            System.out.println("Enter the breadth of the rectangle: ");
            double breadth = sc.nextDouble();
            double area = length*breadth;
            System.out.println("Area of rectangle is : "+ area);
        }
    }
    static class IsoscelesTriangle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length of the equal sides of the triangle: ");
            double side = sc.nextDouble();
            System.out.println("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            double height = Math.sqrt(side*side -(base*base)/4);
            double area = 0.5*base*height;
            System.out.println("Area of Isosceles triangle is : "+ area);
        }
    }
    static class Parallelogram{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the base: ");
            double base = sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();

            double area = base*height;
            System.out.println("Area of a Parallelogram is: "+ area);
        }
    }

}
