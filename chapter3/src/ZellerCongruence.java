import java.util.Scanner;

public class ZellerCongruence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2008): ");
        int year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        if (month == 1){
            month = 13;
            year -= 1;
        }
        else if (month == 2){
            month = 14;
            year -= 1;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (day + (int)(26.0 * (month + 1) / 10) + k + (int)(k / 4.0) + (int)(j / 4.0) + 5 * j) % 7;

        String nameOfDay = "unknown";

        switch (h){
            case 0: {
                nameOfDay = "Saturday";
                break;
            }
            case 1: {
                nameOfDay = "Sunday";
                break;
            }
            case 2: {
                nameOfDay = "Monday";
                break;
            }
            case 3: {
                nameOfDay = "Tuesday";
                break;
            }
            case 4: {
                nameOfDay = "Wednesday";
                break;
            }
            case 5: {
                nameOfDay = "Thursday";
                break;
            }
            case 6: {
                nameOfDay = "Friday";
                break;
            }
        }

        System.out.println("Day of the week is " + nameOfDay);
    }
}
