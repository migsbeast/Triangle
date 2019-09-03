package Tri;
public class Triangle {
    private static double sideA, sideB, sideC;
    private static Triangle t;

    public void Triangle(){
        t = new Triangle();
    }

    public void setSides(double a, double b, double c){
        if(a<0 || b<0 || c<0){
            System.out.println("Please enter 3 new valid positive values to create a triangle.");
        }
        else if(a+b<c){
            System.out.println("Please enter 3 new valid values to create a triangle," +
                    "remember that the sum of 2 sides of a triangle must be strictly greater than the third side! ");
        }
        else{
            sideA = a;
            sideB = b;
            sideC = c;
        }
    }

}
