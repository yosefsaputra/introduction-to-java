import java.util.Scanner;

public class Month {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Year: ");
        int year = input.nextInt();

        System.out.print("Month (1-12): ");
        int month = input.nextInt();

        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month){
        System.out.print(getMonthTitle(year, month));
        System.out.print(getMonthBody(year, month));
    }

    private static String getMonthTitle(int year, int month){
        String title = getMonthName(month) + " " + year;
        String aligner = "";
        for (int x = 1; x < ((border.length() - title.length()) / 2 + 1); x++){
            aligner += " ";
        }
        return aligner + title + aligner + "\n";
    }

    private static String getMonthName(int month){
        String nameOfMonth;
        switch (month){
            case 1:
                nameOfMonth = "January"; break;
            case 2:
                nameOfMonth = "February"; break;
            case 3:
                nameOfMonth = "March"; break;
            case 4:
                nameOfMonth = "April"; break;
            case 5:
                nameOfMonth = "May"; break;
            case 6:
                nameOfMonth = "June"; break;
            case 7:
                nameOfMonth = "July"; break;
            case 8:
                nameOfMonth = "August"; break;
            case 9:
                nameOfMonth = "September"; break;
            case 10:
                nameOfMonth = "October"; break;
            case 11:
                nameOfMonth = "November"; break;
            case 12:
                nameOfMonth = "December"; break;
            default:
                nameOfMonth = "Unknown";
        }
        return nameOfMonth;
    }

    private static String getMonthBody(int year, int month){
        String body = "";

        body += (border + "\n");
        body += " Sun Mon Tue Wed Thu Fri Sat \n";

        int weekday = 0;
        for (int x = 1; x <= getTotalNumberOfDaysInMonth(year, month); x++){
            if (x == 1) {
                int startDay = getStartDay(year, month);
                for (int y = 0; y < getStartDay(year, month); y++) {
                    body += String.format("%4s", "");
                    weekday++;
                }
            }
            body += String.format("%4s", x);
            weekday++;
            if (weekday == 7){
                weekday = 0;
                body += " \n";
            }
        }
        return body;
    }

    private static int getStartDay(int year, int month){
        return ((START_DAY_FOR_JAN_1_1800 + getTotalNumberOfDays(year, month)) % 7);
    }

    private static int START_DAY_FOR_JAN_1_1800 = 3;

    private static String border = "-----------------------------";

    private static int getTotalNumberOfDays(int year, int month){
        int totalNumberOfDays = 0;
        for (int x = year; x >= 1800; x--){
            if (x == year) {
                for (int y = (month - 1); y > 0; y--) {
                    totalNumberOfDays += getTotalNumberOfDaysInMonth(x, y);
                }
            }
            else{
                for (int y = 12; y > 0; y--) {
                    totalNumberOfDays += getTotalNumberOfDaysInMonth(x, y);
                }
            }
        }
        return totalNumberOfDays;
    }

    private static int getTotalNumberOfDaysInMonth(int year, int month){
        int numberOfDaysInMonth;
        switch (month){
            case 1:
                numberOfDaysInMonth = 31; break;
            case 2: {
                if (isLeapYear(year)){
                    numberOfDaysInMonth = 29; break;
                }
                else {
                    numberOfDaysInMonth = 28; break;
                }
            }
            case 3:
                numberOfDaysInMonth = 31; break;
            case 4:
                numberOfDaysInMonth = 30; break;
            case 5:
                numberOfDaysInMonth = 31; break;
            case 6:
                numberOfDaysInMonth = 30; break;
            case 7:
                numberOfDaysInMonth = 31; break;
            case 8:
                numberOfDaysInMonth = 31; break;
            case 9:
                numberOfDaysInMonth = 30; break;
            case 10:
                numberOfDaysInMonth = 31; break;
            case 11:
                numberOfDaysInMonth = 30; break;
            case 12:
                numberOfDaysInMonth = 31; break;
            default:
                numberOfDaysInMonth = 30; break;
        }

        return numberOfDaysInMonth;
    }

    private static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
}
