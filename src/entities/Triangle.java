package entities;

public class Triangle {
    private double base;
    private double height;
    private Point pointA;
    private Point pointB;
    private Point pointC;

    //sobrecarga de construtores
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double calculateAreaByCartesian() {

        double[] a = pointA.getPoint();
        double[] b = pointB.getPoint();
        double[] c = pointC.getPoint();

        // ((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/2

        double det1 = (b[0] - a[0]) * (c[1] - a[1]);
        double det2 = (c[0] - a[0]) * (b[1] - a[1]);

        return Math.abs((det1 - det2) / 2);
    }

    public double calculateAreaByBase() {
        if(!validateValue(this.base, this.height)){
            System.out.println("Invalid values");
            return 0;
        }
        return this.base*this.height/2;
    }

    public boolean validateValue(double base, double height){
        if(this.base <= 0 || this.height <= 0){
            return false;
        }
        return true;
    }
}