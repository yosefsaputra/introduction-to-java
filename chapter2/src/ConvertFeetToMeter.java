import java.util.Scanner;

public class ConvertFeetToMeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet: ");
        int feet = input.nextInt();
        double meter = feet * 0.305;

        System.out.print(feet + " feet is " + meter + " meters");
    }
}
