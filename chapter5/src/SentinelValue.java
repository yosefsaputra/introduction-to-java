import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int data = input.nextInt();
        int sum = 0;
        while(data != 0){
            sum += data;
            System.out.print("Enter an integer: ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
