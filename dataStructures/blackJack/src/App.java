import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String go = "y";
        var deck = new Deck();
        for (int i=0; i<5; i++) {
            deck.shuffle();
        }
        while (go.equals("y")){
            System.out.print("Would you like me to deal a card? (Type 'y' for yes): ");
            go = in.next().toLowerCase();
            if (go.equals("y") && !deck.getDeck().isEmpty()){
                deck.deal();
            }else if(!go.equals("y")){
                System.out.println("Thanks for playing!!");
                break;
            }else{
                System.out.println("No more cards left! Goodbye!");
                break;
            }
        }
        in.close();
    }
}
