import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double degreeCelsius = input.nextDouble();

        double degreeFahrenheit = degreeCelsius * 9 / 5 + 32;

        System.out.println(degreeCelsius + " Celsius is " + degreeFahrenheit + " Fahrenheit");
    }
}
