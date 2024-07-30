import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Coordinates coordinates = new Coordinates();
        System.out.println("----- Triangle Calculator Area -----");

        coordinates.setA(getCoordinates(scanner, "A"));
        coordinates.setB(getCoordinates(scanner, "B"));
        coordinates.setC(getCoordinates(scanner, "C"));

        Triangle triangle = new Triangle(coordinates);
        System.out.println("The area of the triangle is " + triangle.calculateAreaByCartesian());

    }

    public static double[] getCoordinates(Scanner scanner, String point) {
        System.out.println("Enter value for coordinate " + point + "(x,y):");
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        return new double[]{x, y};
    }
}


