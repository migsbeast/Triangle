package Tri;

import java.util.Scanner;
import java.lang.Math;

public class Triangle{
    private static double sideA, sideB, sideC;

    public Triangle(){
        sideA = 0;
        sideB = 0;
        sideC = 0;
    }
    //HW2
    public Triangle(Point a, Point b, Point c){
        double sideA = a.distance(b);
        double sideB = b.distance(c);
        double sideC = c.distance(a);
        this.setSides(sideA,sideB,sideC);
    }

    public void setSides(double a, double b, double c){
        Scanner scanner = new Scanner(System.in);
        if(a<0 || b<0 || c<0){
            System.out.println("Please enter 3 new valid positive values to create a triangle.");
            while(a<0 || b<0 || c<0) {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
            }
        }
        else if(a+b<=c || a+c<=b || b+c<=a){
            System.out.println("Please enter 3 new valid values to create a triangle," +
                    "remember that the sum of 2 sides of a triangle must be strictly greater than the third side! ");
            while(a+b<=c  || a+c<=b || b+c<=a) {
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
            }
        }
        else{
            sideA = a;
            sideB = b;
            sideC = c;
        }
    }

    public static boolean equilateral(){
        return sideA == sideB && sideB == sideC;
    }

    public static boolean isosceles(){
        return sideA == sideB || sideA == sideC || sideB == sideC;
    }

    public static boolean scalene(){
        return sideA != sideB && sideA != sideC && sideB != sideC;
    }

    public static boolean right(){
        if(Math.pow(sideA,2) + Math.pow(sideB,2) == Math.pow(sideC,2)){
            return true;
        }else if(Math.pow(sideA,2) + Math.pow(sideC,2) == Math.pow(sideB,2)){
            return true;
        }else if(Math.pow(sideB,2) + Math.pow(sideC,2) == Math.pow(sideA,2)){
            return true;
        }
        return false;
    }
    //HW1
    public void checkType(){
        if (this.equilateral()) {
            System.out.println("The Triangle is an equilateral Triangle!");
        }
        else if (this.right()) {
            if (this.isosceles()) {
                System.out.println("The Triangle is an isosceles right Triangle!");
            } else if (this.scalene()) {
                System.out.println("The Triangle is an scalene right Triangle!");
            } else {
                System.out.println("The Triangle is an right Triangle!");
            }
        } else if (this.isosceles()) {
            System.out.println("The Triangle is an isosceles Triangle!");
        } else if (this.scalene()) {
            System.out.println("The Triangle is an scalene Triangle!");
        }
    }
    //HW2
    public double getArea(){
        double semiPerm = (sideA + sideB + sideC)/2;
        double area = Math.sqrt((semiPerm)*(semiPerm-sideA)*(semiPerm-sideB)*(semiPerm-sideC));
        return area;
    }
}
