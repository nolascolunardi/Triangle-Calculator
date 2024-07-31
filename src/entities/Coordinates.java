package entities;

public class Coordinates {
    private  double[] a;
    private  double[] b;
    private  double[] c;

    public Coordinates() {
        this.a = new double[2];
        this.b = new double[2];
        this.c = new double[2];
    }

    public void setA(double[] a) {
        this.a = a;
    }
    public void setB(double[] b) {
        this.b = b;
    }
    public void setC(double[] c) {
        this.c = c;
    }
    public double[] getA() {
        return a;
    }
    public double[] getB() {
        return b;
    }
    public double[] getC() {
        return c;
    }
}
