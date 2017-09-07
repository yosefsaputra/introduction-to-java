import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int k = 1;
        int gcd = k;
        while(k <= n1 && k <= n2){
            if (n1 % k == 0 && n2 % k == 0){
                gcd = k;
            }
            k++;
        }

        System.out.println("The GCD is " + gcd);
    }
}
