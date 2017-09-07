import java.util.Scanner;

public class ComputeVolumeCylinder {
    public static void main(String[] args){
        final double PHI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextFloat();
        double length = input.nextFloat();

        double area = radius * radius * PHI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
