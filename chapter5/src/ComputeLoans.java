import java.util.Scanner;

public class ComputeLoans {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.printf("%-20s %-20s %-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        String interestRateString;
        double totalPayment;
        double monthlyPayment;
        for (double interestRate = 5.0; interestRate <= 8.0; interestRate += 0.125){
            interestRateString = String.format("%.3f%%", interestRate);

            monthlyPayment = loanAmount * (interestRate / 1200) / (1 - Math.pow(1 + (interestRate / 1200), -numberOfYears * 12));
            totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-20s %-20.2f %-20.2f\n", interestRateString, monthlyPayment, totalPayment);
        }
    }
}
