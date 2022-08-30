package Stringsexcersice;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(computerchoice());

        System.out.println("Let's play Rock Paper Scissors!\nWhen I say 'shoot', Choose: rock, pape, scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String answer = scan.next();

        if (answer.equals("yes")) {
            System.out.println("Great!\nrock - paper - scissors, shoot!");
            String choice = scan.next();
            String computerChoice = computerchoice();
            String result =  Result(choice, computerChoice);
            printResult(choice,computerChoice,result);
        }
        else{
            System.out.println("See youn next time :)");
        }
    }
    public static String computerchoice() {
        double randonNumber = Math.random() * 3;
        int integer= (int) randonNumber;
        switch (integer) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default: return "";
        }
    }
    public static String Result(String choice, String computerchoice){
        String result = "";
        if (choice.equals("rock") && computerchoice.equals("scissors")){
            result = "You win!";
        } else if (computerchoice.equals("rock") && choice.equals("scissors")){
            result = "You lose!";
        }else if (choice.equals("paper") && computerchoice.equals("rock")){
            result = "You win!";
        }else if (computerchoice.equals("paper") && choice.equals("rock")) {
            result = "You lose!";
        } else if (choice.equals("scissors") && computerchoice.equals("paper")) {
            result = "You win!";
        }else if (computerchoice.equals("scissors") && choice.equals("paper")) {
            result = "You lose!";
        }else{
            result = "Its a tie";
        }
        return result;
    }
    public static void printResult(String choice, String computerChoice, String result){
        System.out.println("\n"+"Your choice:\t"+choice.toLowerCase());
        System.out.println("Computer choice:\t"+computerChoice);
        System.out.println("Result:\t"+result);
    }

}
