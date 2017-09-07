public class ComputeFutureTuition {
    public static void main(String[] args){
        double currentTuition = 10000;

        double tuition = 0;

        double totalTuition = 0;

        for (int year = 1; year <= 14; year++){
            tuition = currentTuition * Math.pow(1.05, year - 1);
            System.out.printf("Tuition year %d is $%.2f\n", year, tuition);
            if (year >= 11){
                totalTuition += tuition;
            }
        }

        System.out.printf("Total 4-year tuition after 10th year is $%.2f\n", totalTuition);
    }
}
