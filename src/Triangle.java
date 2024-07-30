
public class Triangle {
    private final Coordinates coordinates;

    public Triangle(Coordinates coordinates) {
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

}