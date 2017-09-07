import java.util.Scanner;

public class PointInATriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x-coordinate and y-coordinate: ");
        double xInput = input.nextDouble();
        double yInput = input.nextDouble();

        boolean inTriangle = false;

        if (xInput <= 200 && xInput >= 0 && yInput <= (-0.5 * xInput + 100) && yInput >= 0){
            inTriangle = true;
        }

        if (inTriangle){
            System.out.println("This point is in the triangle");
        }
        else{
            System.out.println("This point is NOT in the triangle");
        }
    }
}
