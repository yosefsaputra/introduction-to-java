import java.util.Scanner;

public class LearningAddition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1 = (int)System.currentTimeMillis() % 100;
        int number2 = (int)(Math.random() * 100);

        System.out.println(number1 + " + " + number2 + " = ");
        System.out.print("Please enter the answer: ");
        int inputAnswer = input.nextInt();

        if (inputAnswer == number1 + number2){
            System.out.println("Your answer is correct");
        }
        else{
            System.out.println("Your answer is incorrect");
        }

    }
}
