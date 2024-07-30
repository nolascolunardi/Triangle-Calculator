import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit){
            System.out.print("----Triangle Area Calculator----\nCalculate Area by Base and Height\nDigit the base: ");
            double base = scanner.nextDouble();
            System.out.print("Digit the height: ");
            double height = scanner.nextDouble();

            Triangle triangle = new Triangle(base, height);
            System.out.printf("The area of the triangle is: %.2f\n", triangle.calculateArea());

            System.out.println("Do you want to calculate another triangle? (y/n)");
            String answer = scanner.next();

            if (answer.equals("n")) {
                exit = true;
                break;
            }
        }

        scanner.close();
    }
}