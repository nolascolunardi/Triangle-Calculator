package entities;

public class Triangle {
    private  double base;
    private  double height;
    private  Coordinates coordinates;

    //sobrecarga de construtores
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Triangle(double base, double height, Coordinates coordinates) {
        this.base = base;
        this.height = height;
        this.coordinates = coordinates;
    }

    public double calculateAreaByCartesian() {
        double[] a = coordinates.getA();
        double[] b = coordinates.getB();
        double[] c = coordinates.getC();

        double det1 = (b[0] - a[0]) * (c[1] - a[1]);
        double det2 = (c[0] - a[0]) * (b[1] - a[1]);
        return Math.abs(det1 - det2) / 2.0;
    }
    public double calculateAreaByBase() {
        return this.base*this.height/2;
    }
    public boolean validateValue(double base, double height){
        if(this.base <= 0 || this.height <= 0){
            return false;
        }
        return true;
    }
}