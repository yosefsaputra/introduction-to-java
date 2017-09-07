import java.util.Scanner;

public class ComputeCompoundValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly saving and annual interest rate: ");

        double monthlySaving = input.nextDouble();
        int annualInterestRate = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / 12.0;

        double balance = monthlySaving;
        balance *= (1 + monthlyInterestRate);
        balance += monthlySaving;
        balance *= (1 + monthlyInterestRate);
        balance += monthlySaving;
        balance *= (1 + monthlyInterestRate);
        balance += monthlySaving;
        balance *= (1 + monthlyInterestRate);
        balance += monthlySaving;
        balance *= (1 + monthlyInterestRate);
        balance += monthlySaving;
        balance *= (1 + monthlyInterestRate);

        System.out.println("By the end of sixth month, the account value is " + balance);
    }
}
