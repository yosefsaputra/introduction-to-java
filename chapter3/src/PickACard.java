public class PickACard {
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 100) % 13 + 1;
        int number2 = (int)(Math.random() * 100) % 4 + 1;
        String card1, card2;

        switch (number1){
            case 1:
                card1 = "Ace"; break;
            case 2:
                card1 = "2"; break;
            case 3:
                card1 = "3"; break;
            case 4:
                card1 = "4"; break;
            case 5:
                card1 = "5"; break;
            case 6:
                card1 = "6"; break;
            case 7:
                card1 = "7"; break;
            case 8:
                card1 = "8"; break;
            case 9:
                card1 = "9"; break;
            case 10:
                card1 = "10"; break;
            case 11:
                card1 = "Jack"; break;
            case 12:
                card1 = "Queen"; break;
            case 13:
                card1 = "King"; break;
            default:
                card1 = "None";
        }

        switch (number2){
            case 1:
                card2 = "Spade"; break;
            case 2:
                card2 = "Heart"; break;
            case 3:
                card2 = "Club"; break;
            case 4:
                card2 = "Diamond"; break;
            default:
                card2 = "None";
        }

        System.out.println("Your card is " + card1 + " of " + card2);
    }
}
