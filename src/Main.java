import Tri.Triangle;

import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        char ans;
        do {
            Triangle testTri = new Triangle();
            System.out.println("Please enter 3 values for each side of a triangle.");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            testTri.setSides(a, b, c);
            double area = testTri.getArea();
            DecimalFormat df = new DecimalFormat("#.##");


            if (testTri.equilateral()) {
                System.out.println("The Triangle is an equilateral Triangle!");
            }
            else if (testTri.right()) {
                if (testTri.isosceles()) {
                    System.out.println("The Triangle is an isosceles right Triangle!");
                } else if (testTri.scalene()) {
                    System.out.println("The Triangle is an scalene right Triangle!");
                } else {
                    System.out.println("The Triangle is an right Triangle!");
                }
            } else if (testTri.isosceles()) {
                System.out.println("The Triangle is an isosceles Triangle!");
            } else if (testTri.scalene()) {
                System.out.println("The Triangle is an scalene Triangle!");
            }

            System.out.println("The area of the Triangle is: "+ df.format(area));

            System.out.println("Continue? (Y/N)");
            ans = scanner.next().charAt(0);
        } while(ans =='Y'||ans=='y');
    }
}
