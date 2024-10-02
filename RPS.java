import java.util.*;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock, Paper, Scissors.");
        System.out.println("When I say 'shoot', choose: Rock, Paper, or Scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = scan.nextLine();

        if (!ready.equals("yes")) {
            System.out.println("If you need more time, come back later.");
        } else {
            System.out.println("Rock - Paper - Scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = pcRandom();
            System.out.println(computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a Tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
                System.out.println("Paper beats rock. You Lose!");
            } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("Paper beats rock. You Win!");
            } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
                System.out.println("Rock beats scissors. You Lose!");
            } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("Scissors beat paper. You Win!");
            }
        }

        scan.close();
    }

    public static String pcRandom() {
        String[] pcChoices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        int randomItem = rand.nextInt(pcChoices.length);
        String randomChoice = pcChoices[randomItem];
        return "Computer chose: " + randomChoice;
    }
}