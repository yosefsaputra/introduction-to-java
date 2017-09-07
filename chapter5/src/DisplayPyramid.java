import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int totalLineNumber = input.nextInt();

        String temp = Integer.toString(totalLineNumber);
        int noOfDigits = temp.length();
        temp = "%" + noOfDigits + "s";

        String lineString = "";

        for (int lineNumber = 1; lineNumber <= totalLineNumber; lineNumber++){
            for (int x = totalLineNumber; x >= 1; x--){
                if (x <= lineNumber){
                    lineString += String.format(temp, x);
                }
                else{
                    lineString += String.format(temp, " ");
                }
                lineString += " ";
            }
            for (int x = 2; x <= lineNumber; x++){
                lineString += String.format(temp, x);;
                lineString += " ";
            }
            System.out.println(lineString);
            lineString = "";
        }
    }
}
