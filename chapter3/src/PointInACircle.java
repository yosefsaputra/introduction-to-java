import java.util.Scanner;

public class PointInACircle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point coordinate: ");
        double xInput = input.nextDouble();
        double yInput = input.nextDouble();

        double radius = 10;

        if (Math.pow((xInput * xInput + yInput * yInput), 0.5) <= 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle", xInput, yInput);
        }
        else{
            System.out.printf("Point (%.1f, %.1f) is NOT in the circle", xInput, yInput);
        }
    }
}
