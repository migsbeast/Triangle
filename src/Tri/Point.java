package Tri;

public class Point{
    private double x, y;

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(Double x1, Double y1) {
        x = x1;
        y = y1;
    }

    public void setX(double x1){
        x = x1;
    }

    public void setY(double y1){
        y = y1;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setXY(double x1, double y1){
        x = x1;
        y = y1;
    }

    public double[] getXY(){
        double[] xyPair= new double[] {x,y};
        return xyPair;
    }

    public double distance(double x, double y) {
        double xDiff = this.x - x;
        double yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(Point pt1){
        double xDiff = this.x - pt1.x;
        double yDiff = this.y - pt1.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
