import java.util.Scanner;
import entities.Coordinates;
import entities.Triangle;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coordinates coordinates = new Coordinates();
        int option = 0;

        do{
            System.out.println("\n----- Triangle Calculator Area -----\n1 - Base and Height\n2 - Cartesian Coordinates\n3- Exit\nChoose an option:");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter the base of the triangle:");
                    double base = scanner.nextDouble();
                    System.out.println("Enter the height of the triangle:");
                    double height = scanner.nextDouble();
                    Triangle triangle = new Triangle(base, height);
                    System.out.println("The area of the triangle is " + triangle.calculateAreaByBase());
                    break;
                case 2:
                    coordinates.setA(getCoordinates(scanner, "A"));
                    coordinates.setB(getCoordinates(scanner, "B"));
                    coordinates.setC(getCoordinates(scanner, "C"));
                    Triangle triangle1 = new Triangle(coordinates);
                    System.out.println("The area of the triangle is " + triangle1.calculateAreaByCartesian());
                    break;
                case 3:
                    option = -1;
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while (option != -1);
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


