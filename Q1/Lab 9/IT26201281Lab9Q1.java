import java.util.Scanner;

public class ITxxxxxxxxLab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b, c;
        double discriminant, root1, root2;

        System.out.print("Enter value a: ");
        a = input.nextDouble();
        
        System.out.print("Enter value b: ");
        b = input.nextDouble();
        
        System.out.print("Enter value c: ");
        c = input.nextDouble();

        // Using pow() and sqrt() as per hint
        discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("\nRoots are real and different :");
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            // To get -1.00 and -1.50 like expected output
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
            
        } else if (discriminant == 0) {
            System.out.println("\nRoots are real and equal :");
            root1 = -b / (2 * a);
            System.out.printf("Root: %.2f\n", root1);
            
        } else {
            System.out.println("\nRoots are imaginary / complex");
        }
        
        input.close();
    }
}