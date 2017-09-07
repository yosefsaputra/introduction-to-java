import java.util.Scanner;

public class CalculateGratuity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal and a gratuity: ");
        double subtotal = input.nextDouble();
        int gratuityRate = input.nextInt();

        double gratuity = (int)(gratuityRate / 100.0 * subtotal * 100) / 100.0;
        double total = (int)((subtotal + gratuity) * 100) / 100.0;

        System.out.println("The gratuity is " + gratuity + " and total is " + total);
    }
}
