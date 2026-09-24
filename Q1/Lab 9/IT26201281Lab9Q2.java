import java.util.Scanner;

public class IT26201281Lab9Q2 {

    // Method to calculate circle area
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        // or Math.PI * radius * radius
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double r = input.nextDouble();

        double result = circleArea(r);

        System.out.println("The area of the circle with radius " + r + " is : " + result);

        input.close();
    }
}