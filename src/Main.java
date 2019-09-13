import Tri.*;

import java.text.DecimalFormat;
import java.util.*;
public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        char ans;
        do {
            Triangle testTri = new Triangle();
            System.out.println("Please choose how you would like to create a Triangle");
            System.out.println("Enter 1 to specify the sides of a Triangle or 2 to specify the corners of a triangle");
            int opt = scanner.nextInt();

            if(opt == 1){
                System.out.println("Please enter 3 sides to create each side of a triangle");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                testTri.setSides(a, b, c);
                double area = testTri.getArea();
                testTri.checkType();
            }
            else if(opt == 2){

                System.out.println("Please enter 3 points to create each corner of a triangle. Enter the first corner's X Coordinate then press enter, then record it's Y Coordinate and hit enter again.");
                System.out.println("Repeat for the next two corners.");
                Double ax = scanner.nextDouble();
                Double ay = scanner.nextDouble();
                Point pointA = new Point(ax, ay);

                Double bx = scanner.nextDouble();
                Double by = scanner.nextDouble();
                Point pointB = new Point(bx, by);

                Double cx = scanner.nextDouble();
                Double cy = scanner.nextDouble();
                Point pointC = new Point(cx, cy);

                Triangle triCorners = new Triangle(pointA, pointB, pointC);
                triCorners.checkType();
            }
            else{
                System.out.println("Incorrect option please try again");
            }
            System.out.println("Continue? (Y/N)");
            ans = scanner.next().charAt(0);
        } while(ans =='Y'||ans=='y');

    }
}
