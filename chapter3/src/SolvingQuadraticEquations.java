import java.util.Scanner;

public class SolvingQuadraticEquations {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double variableA = input.nextDouble();
        double variableB = input.nextDouble();
        double variableC = input.nextDouble();

        double discriminant = Math.pow(variableB, 2) - 4 * variableA * variableC;

        if (discriminant > 0){
            double root1 = ((-variableB) + Math.pow(discriminant, 0.5)) / (2 * variableA);
            double root2 = ((-variableB) - Math.pow(discriminant, 0.5)) / (2 * variableA);
            System.out.printf("The roots are %.6f and %.6f", root1, root2);
        }
        else if (discriminant == 0){
            double root1 = (-variableB) / (2 * variableA);
            System.out.printf("The root is %.6f", root1);
        }
        else if (discriminant < 0){
            System.out.println("The equation has no real roots");
        }
        else{
            System.exit(0);
        }
    }
}
