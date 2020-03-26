package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {

    public static void main(String[] args)
    {
        double area;
        double radius;
        double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.println("input a radius");

        radius = input.nextDouble();
        area = Circle.getArea(radius);
        System.out.println(area);
    }
}
