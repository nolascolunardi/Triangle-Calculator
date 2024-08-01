package entities;

public class Triangle {
    private double base;
    private double height;
    private Point pointA;
    private Point pointB;
    private Point pointC;

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
        double det1 = (this.pointB.getX()-this.pointA.getX())* (this.pointC.getY()-this.pointA.getY());
        double det2 = (this.pointC.getX()-this.pointA.getX())* (this.pointB.getY()-this.pointA.getY());

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