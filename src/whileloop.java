import java.util.Scanner;

public class whileloop {
    public static void main (String [] args) {

        Scanner reader = new Scanner(System.in);
        int lives = 3;

        while (lives > 0) {
            System.out.println("You ONLY have " + lives + " lives to answer");
            System.out.println("What is the oldest CITY in the Philippines ?");
            System.out.print("Answer :");
            String answer = reader.nextLine();

            if (answer.trim().equalsIgnoreCase("Cebu") || answer.equalsIgnoreCase("Cebu City")) {
                System.out.println("You GOT it!");
                break;
            }else {
                lives--;
                if (lives > 0) {
                    System.out.println("Try again...");
                }
              }
            }
        if (lives == 0) {
            System.out.println("You lost");
            return;
        }

        System.out.println("Second Question");

        while (lives > 0){
            System.out.println("You have "+lives+" lives to answer" );
            System.out.println("What is the Capital CITY of the Philippines?");
            System.out.print("Answer :");
            String answer = reader.nextLine();

            if (answer.trim().equalsIgnoreCase("Manila") || answer.equalsIgnoreCase("Manila City")) {
                System.out.println("You GOT it!");
                break;
            } else {
                lives--;
                if (lives > 0) {
                    System.out.println("Try again...");
                }           
            }
        }

        if (lives == 0) {
            System.out.println("You got");
        } else {
            System.out.println("Congratulations! You've answered all the questions correctly.");
        }
    }
}
