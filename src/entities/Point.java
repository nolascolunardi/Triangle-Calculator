package entities;

public class Point {
    private  double x;
    private  double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getPoint (){
        return new double[]{this.x , this.y};
    }
}
