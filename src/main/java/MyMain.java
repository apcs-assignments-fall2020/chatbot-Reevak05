import java.util.Scanner;

public class MyMain {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        //name question
        System.out.println("What is your name? ");
        final String name = scan.next();
        System.out.println("Hello, "+ name + "!");

        //favorite subject question
        System.out.println("What is your favorite school subject? ");
        final String subject = scan.next();
        if (!subject.equals("computer science")&&!subject.equals("APCS")&&!subject.equals("compsci")) System.out.println(subject + " is an interesting subject, "+ name + "! My favorite subject is computer science.");
        else System.out.println("Wow! Computer science is my favorite subject too!");

        //coffee question
        System.out.println("Do you like coffee?");
        final String coffee = scan.next();
        if (coffee.equals("yes")||coffee.equals("yeah")) System.out.println("I like it too! We should have coffee together sometime.");
        else System.out.println("I don't like it either! I find it disgusting.");

        //games question
        System.out.println("Did you know you can play rock, paper, scissors, with me?");
        if (scan.next().equals("yes")) System.out.println("Then you must know how fun it is! Would you like to play a round?");
        else System.out.println("It's your lucky day! Shall we play a game?");

        //rock, paper scissors repeat
        boolean gaming = true;
        if (scan.next().equals("yes")) {
        while (gaming) {
            //rock, paper, scissors
            System.out.println("I'm warning you; I'm very good at Rock, Paper, Scissors!");
            System.out.println(" ");
            System.out.println("Rock, paper, scissors! What do you play?");
            final String guess = scan.next();
            if (guess.equals("rock")) System.out.println("I played paper! I told you I was good at this game.");
            else if (guess.equals("paper")) System.out.println("I played scissors! Better luck next time!");
            else if (guess.equals("scissors")) System.out.println("I played rock! I doubt you'll ever win against a computer.");
            else System.out.println("I think that's cheating, but whatever. I guess you win.");
            System.out.println("Would you like to play again?");
            if (!scan.next().equals("yes")) {
                System.out.println("Are you going to go study some " +subject+"? Let's play again soon, "+name+"!");
                gaming = false;
            }
           
        }
        }
        scan.close();
    }
}
