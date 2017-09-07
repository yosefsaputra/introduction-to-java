import java.util.Scanner;

public class SumDigitsOfInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int specificNumber = input.nextInt();

        int digit1 = specificNumber % 10;
        int digit2 = specificNumber / 10 % 10;
        int digit3 = specificNumber / 100 % 10;

        int sumOfDigits = digit1 + digit2 + digit3;

        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
